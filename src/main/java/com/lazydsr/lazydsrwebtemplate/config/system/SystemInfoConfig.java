package com.lazydsr.lazydsrwebtemplate.config.system;

import com.lazydsr.lazydsrwebtemplate.entity.SystemInfo;
import com.lazydsr.lazydsrwebtemplate.service.SystemInfoService;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Properties;

/**
 * SystemInfoConfig
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.system
 * Created by Lazy on 2018/3/15 0:10
 * Version: 0.1
 * Info: @TODO:...
 */
@Component
public class SystemInfoConfig {
    @Autowired
    private SystemInfoService systemInfoService;

    public SystemInfo init() throws UnknownHostException, SigarException {
        SystemInfo newsystemInfo = new SystemInfo();
        Sigar sigar=new Sigar();
        Runtime r = Runtime.getRuntime();
        Properties props = System.getProperties();
        InetAddress  addr = InetAddress.getLocalHost();
        Map<String, String> map = System.getenv();

        newsystemInfo.setUserName(map.get("USERNAME"));
        newsystemInfo.setServerName(map.get("COMPUTERNAME"));
        newsystemInfo.setDomain(map.get("USERDOMAIN"));

        //获取网络相关
        String ifNames[] = sigar.getNetInterfaceList();

        //newsystemInfo.setIp();


        return systemInfoService.save(newsystemInfo);
    }
}
