package com.lazydsr.lazydsrwebtemplate.config.system;

import com.lazydsr.lazydsrwebtemplate.entity.SystemInfo;
import com.lazydsr.lazydsrwebtemplate.service.SystemInfoService;
import com.lazydsr.lazydsrwebtemplate.util.SpringContextUtil;
import org.hyperic.sigar.*;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Properties;

/**
 * SystemInfoConfiguration
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.system
 * Created by Lazy on 2018/3/15 0:10
 * Version: 0.1
 * Info: @TODO:...
 */
//@Component
public class SystemInfoConfiguration {
    private static SystemInfoConfiguration instance;
    private static byte[] lock = new byte[0];
    private static int M = 1024 * 1024;

    public static synchronized SystemInfoConfiguration getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new SystemInfoConfiguration();
                }
            }
        }
        return instance;
    }

    public SystemInfo init() throws UnknownHostException, SigarException {
        SystemInfoService systemInfoService = SpringContextUtil.getBean(SystemInfoService.class);

        SystemInfo newsystemInfo = new SystemInfo();

        Sigar sigar = new Sigar();
        Runtime runtime = Runtime.getRuntime();
        Properties props = System.getProperties();
        InetAddress addr = InetAddress.getLocalHost();
        Map<String, String> map = System.getenv();


        newsystemInfo.setUserName(props.getProperty("user.name"));
        newsystemInfo.setServerName(addr.getHostName());
        newsystemInfo.setDomain(System.getenv("USERDOMAIN"));

        //获取网络相关
        String[] ifNames = sigar.getNetInterfaceList();

        StringBuffer netName = new StringBuffer();
        StringBuffer ip = new StringBuffer();
        StringBuffer mac = new StringBuffer();

        for (int i = 0; i < ifNames.length; i++) {
            NetInterfaceConfig ifconfig = sigar.getNetInterfaceConfig(ifNames[i]);
            if (NetFlags.LOOPBACK_ADDRESS.equals(ifconfig.getAddress()) || (ifconfig.getFlags() & NetFlags.IFF_LOOPBACK) != 0
                    || NetFlags.NULL_HWADDR.equals(ifconfig.getHwaddr())) {
                continue;
            }
            if (ifconfig.getAddress().replaceAll("\\.", "").equals("0000")) {
                continue;
            }
            netName.append(ifconfig.getName()).append(",");
            ip.append(ifconfig.getAddress()).append(",");
            mac.append(ifconfig.getHwaddr()).append(",");

        }
        newsystemInfo.setNetName(netName.toString().substring(0, netName.toString().length() - 1));
        newsystemInfo.setIp(ip.toString().substring(0, ip.toString().length() - 1));
        newsystemInfo.setMac(mac.toString().substring(0, mac.toString().length() - 1));
        newsystemInfo.setHost(addr.getHostAddress());

        //os
        //OperatingSystem os = OperatingSystem.getInstance();

        newsystemInfo.setOsArch(props.getProperty("os.arch"));
        newsystemInfo.setOsName(props.getProperty("os.name"));
        newsystemInfo.setOsVersion(props.getProperty("os.version"));

        //cpu
        CpuInfo[] cpuInfos = sigar.getCpuInfoList();

        StringBuffer cpuMhz = new StringBuffer();
        StringBuffer cpuVendor = new StringBuffer();
        StringBuffer cpuModel = new StringBuffer();
        StringBuffer cpuCacheSize = new StringBuffer();

        for (int i = 0; i < cpuInfos.length; i++) {// 不管是单块CPU还是多CPU都适用

            CpuInfo cpuInfo = cpuInfos[i];
            cpuMhz.append(cpuInfo.getMhz() + "").append(",");
            cpuVendor.append(cpuInfo.getVendor() + "").append(",");
            cpuModel.append(cpuInfo.getModel() + "").append(",");
            cpuCacheSize.append(cpuInfo.getCacheSize() + "").append(",");
        }
        newsystemInfo.setCpuMhz(cpuMhz.toString().substring(0, cpuMhz.length() - 1));
        newsystemInfo.setCpuVendor(cpuVendor.toString().substring(0, cpuVendor.length() - 1));
        newsystemInfo.setCpuModel(cpuModel.toString().substring(0, cpuModel.length() - 1));
        newsystemInfo.setCpuCacheSize(cpuCacheSize.toString().substring(0, cpuCacheSize.length() - 1));

        //mem
        Mem mem = sigar.getMem();
        newsystemInfo.setMemTotal(mem.getTotal() / M);


        //jvm
        MemoryMXBean memorymbean = ManagementFactory.getMemoryMXBean();
        MemoryUsage usage = memorymbean.getHeapMemoryUsage();
        newsystemInfo.setJvmXmx(usage.getMax() / M);
        newsystemInfo.setJvmXms(usage.getInit() / M);
        newsystemInfo.setJvmXmn(0);
        newsystemInfo.setJvmAvailableProcessors(runtime.availableProcessors());
        newsystemInfo.setJvmVersion(props.getProperty("java.version"));
        newsystemInfo.setJvmHome(props.getProperty("java.home"));
        newsystemInfo.setJvmAppHome(props.getProperty("user.dir"));
        newsystemInfo.setJvmClassVersion(props.getProperty("java.class.version"));

        //


        return systemInfoService.add(newsystemInfo);
    }
}
