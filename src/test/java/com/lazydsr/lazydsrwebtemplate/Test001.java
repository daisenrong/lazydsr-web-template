package com.lazydsr.lazydsrwebtemplate;

import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

/**
 * Test001
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate
 * Created by Lazy on 2018/3/13 8:58
 * Version: 0.1
 * Info: @TODO:...
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test001 {
    //@Autowired
    //private ScheduleJobService scheduleJobService;
    //@Test
    //public void test1() {
    //    String s = "aaa,vvv,ccc,";
    //    String[] split = s.split(",");
    //    System.out.println(split.length);
    //
    //}
    //@Test
    //public void add(){
    //    ScheduleJob scheduleJob = new ScheduleJob();
    //    scheduleJob.setName("aaa");
    //    scheduleJob.setClasspath("ss");
    //    scheduleJob.setCron("sss");
    //    System.out.println(scheduleJob);
    //    ScheduleJob add = scheduleJobService.add(scheduleJob);
    //    System.out.println(add);
    //}

    @Test
    public void test2() throws InterruptedException {
        Thread a = new Thread();
        Thread b = new Thread();
        Thread c = new Thread();

        a.start();
        a.join();

        b.start();
        b.join();

        c.start();
        c.join();

    }

    @Test
    public void cpu() throws SigarException {
        Sigar sigar = new Sigar();
        CpuInfo infos[] = sigar.getCpuInfoList();

        for (int i = 0; i < infos.length; i++) {// 不管是单块CPU还是多CPU都适用
            CpuInfo info = infos[i];
            System.out.println("第" + (i + 1) + "块CPU信息");
            System.out.println("CPU的总量MHz:    " + info.getMhz());// CPU的总量MHz
            System.out.println("CPU生产商:    " + info.getVendor());// 获得CPU的卖主，如：Intel
            System.out.println("CPU类别:    " + info.getModel());// 获得CPU的类别，如：Celeron
            System.out.println("CPU缓存数量:    " + info.getCacheSize());// 缓冲存储器数量
            //printCpuPerc(cpuList[i]);
        }
    }

    @Test
    public void test002() throws SigarException {
        MemoryMXBean memorymbean = ManagementFactory.getMemoryMXBean();
        MemoryUsage usage = memorymbean.getHeapMemoryUsage();
        System.out.println("INIT HEAP: " + usage.getInit()/1024/1024);
        System.out.println("MAX HEAP: " + usage.getMax()/1024/1024);
        System.out.println("USE HEAP: " + usage.getUsed()/1024/1024);
        System.out.println("\nFull Information:");
        System.out.println("Heap Memory Usage: "
                + memorymbean.getHeapMemoryUsage());
        System.out.println("Non-Heap Memory Usage: "
                + memorymbean.getNonHeapMemoryUsage());
        Sigar sigar = new Sigar();
        Mem mem = sigar.getMem();
        System.out.println(mem.getTotal()/1024/1024);;

    }

}

class StaticStuff {
    static int x = 10;

    {
        x += 15;
    }

    static {
        x += 5;
    }

    public static void main(String args[]) {
        System.out.println("x=" + x);
    }

    static {
        x /= 3;
    }

}

class StringEqualTest {

    public static void main(String[] args) {
        String a = "Programming";
        String b = new String("Programming");
        String c = "Program" + "ming";

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.intern() == b.intern());
    }
}
