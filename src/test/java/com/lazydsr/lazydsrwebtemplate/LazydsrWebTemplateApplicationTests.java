package com.lazydsr.lazydsrwebtemplate;

import com.lazydsr.lazydsrwebtemplate.config.system.SystemInfoConfiguration;
import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import com.lazydsr.lazydsrwebtemplate.entity.User;
import com.lazydsr.lazydsrwebtemplate.entity.UserLoginRecord;
import com.lazydsr.lazydsrwebtemplate.mapper.UserLoginRecordMapper;
import com.lazydsr.lazydsrwebtemplate.mapper.UserMapper;
import com.lazydsr.lazydsrwebtemplate.service.MenuService;
import com.lazydsr.lazydsrwebtemplate.service.SystemInfoService;
import com.lazydsr.lazydsrwebtemplate.service.UserLoginRecordService;
import com.lazydsr.lazydsrwebtemplate.service.UserService;
import com.lazydsr.lazydsrwebtemplate.util.SpringContextUtil;
import com.lazydsr.util.id.UtilUUId;
import com.lazydsr.util.time.UtilDateTime;
import lombok.extern.slf4j.Slf4j;
import org.hyperic.sigar.SigarException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LazydsrWebTemplateApplicationTests {

    @Autowired
    private MenuService menuService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserLoginRecordMapper userLoginRecordMapper;

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testRedis(){
        ListOperations opsForList = redisTemplate.opsForList();
        List<Object> list=new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(1);
        list.add("3");
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));

        opsForList.leftPushAll("testList1",list);
        List testList01 = opsForList.range("testList1", 0, -1);
        //System.out.println(list);
        System.out.println(testList01);



        Object testList0 = opsForList.index("testList1", 0);
        System.out.println(testList0);
        opsForList.set("testList1",0,4444);
        Object testList1 = opsForList.index("testList1", 0);
        System.out.println(testList1);


        //opsForList.leftPushAll("testList0",1,2,3);
        //Object testList0 = opsForList.leftPop("testList0");
        //System.out.println(testList0);
        List testList02 = opsForList.range("testList1", 0, -1);
        //System.out.println(list);
        System.out.println(testList02);

        //redisTemplate.opsForValue().set("s",11);
        //Object s = redisTemplate.opsForValue().get("s");
        //
        //redisTemplate.opsForHash().put("map0","a",222);
        //Map entries = redisTemplate.opsForHash().entries("map0");
        //for (Object key:entries.keySet()){
        //
        //    log.error(key.toString());
        //    log.error(entries.get(key).toString());
        //}
        ////redisTemplate.getConnectionFactory().getConnection().f
        ////
        ////Map entries = redisTemplate.opsForHash().("map0");
        //for (Object key:entries.keySet()){
        //
        //    log.error(key.toString());
        //    log.error(entries.get(key).toString());
        //}

    }

    @Test
    public void testTkMapper() {
        //List<User> users = userMapper.selectAll();
        //System.out.println(userMa);
        //System.out.println(userMapper.selectAll());
        userMapper.selectAll().stream().forEach(user -> {
            System.out.println(user);
        });
        System.out.println(userLoginRecordMapper.selectAll());
    }

    @Test
    public void contextLoads002() {
        UserService userService = SpringContextUtil.getBean(UserService.class);
        System.out.println(userService);

    }

    @Test
    public void contextLoads() {
        User user1 = new User();
        user1.setId(UtilUUId.getId());
        user1.setName("admin");
        user1.setUsername("admin");
        user1.setPassword("admin");
        user1.setMobile("1111");
        int count = userMapper.insert(user1);
        User user = userMapper.selectByPrimaryKey(user1.getId());
        System.out.println(user);

        //userRepository.findAll().stream().forEach(u -> System.out.println(u));

    }

    @Autowired
    private SystemInfoService systemInfoService;

    @Test
    public void addSystemInfo() {
        try {
            SystemInfoConfiguration.getInstance().init();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SigarException e) {
            e.printStackTrace();
        }

        //userRepository.findAll().stream().forEach(u -> System.out.println(u));

    }

    @Test
    public void menuSelectAll() {
        //PageInfo<Menu> pageInfo = menuService.findAllNormal();
        //List<Menu> list = pageInfo.getList();
        //System.out.println(pageInfo);
        //System.out.println(list);
    }

    @Autowired
    private UserLoginRecordService userLoginRecordService;
    @Test
    public void userLoginRecord() {
        List<UserLoginRecord> userLoginRecords = userLoginRecordService.findByUserId("DKT6B56QC6VVBUEJUV48PBU3PRD1JJKQ");
        System.out.println(userLoginRecords);
        //PageInfo<Menu> pageInfo = menuService.findAllNormal();
        //List<Menu> list = pageInfo.getList();
        //System.out.println(pageInfo);
        //System.out.println(list);
    }

    @Test
    public void menuAddOne() {
        //for (int i=0;i<1000;i++){

        Menu menu = new Menu();
        menu.setId(UtilUUId.getId());
        menu.setParentId("32U455N29Z2QCP6JKA3NTW9K7YV9JET6");
        menu.setName("登录记录");
        menu.setEnName("Login Record");
        menu.setDescription("登录记录");
        menu.setIcon("fa fa-bars");
        menu.setTarget("iframe");
        menu.setUrl("/userLoginRecord");
        menuService.add(menu);
        //}
    }

    @Test
    public void menuAdd() {
        for (int i = 0; i < 1000; i++) {

            Menu menu = new Menu();
            menu.setId(UtilUUId.getId());
            menu.setParentId("MUUE9WW3TA1KCY2JGQMRTJ6ZNRMTKWGF");
            menu.setName("用户管理");
            menu.setEnName("User Manager");
            menu.setDescription("用户管理");
            menu.setIcon("fa fa-user");
            menu.setTarget("iframe");
            menu.setUrl("/user");
            menuService.add(menu);
        }
    }

    @Test
    public void contextLoads1() {
        //User user = userRepository.add(new User("aa"));
        //System.out.println(user);

        //userRepository.findByNameLike("aa").stream().forEach(u -> System.out.println(u));

    }

    @Test
    public void contextLoads2() {
        //User user = userRepository.add(new User("aa"));
        //System.out.println(user);

        //userRepository.findByNameLike("%a%").stream().forEach(u -> System.out.println(u));

    }

    @Test
    public void contextLoads3() {
        //User user = userRepository.add(new User("aa"));
        //System.out.println(user);

        //userRepository.findByNameLikeCus("aa").stream().forEach(u-> System.out.println(u));
        //userRepository.findByNameLikeCus1("aa").stream().forEach(u-> System.out.println(u));
        //userRepository.findByNameLikeCus2("aa").stream().forEach(u-> System.out.println(u));
        //System.out.println("-------------");
        //userDao.findbyNameJdbc("aa").stream().forEach(u -> System.out.println(u));

    }

    @Test
    public void contextLoads4() {
        DataSourceInfo dataSourceInfo = new DataSourceInfo();
        dataSourceInfo.setName(UtilDateTime.getCurrSecond() + "");
        //DataSourceInfo info = dataSourceInfoRepository.add(dataSourceInfo);
        DataSourceInfo info = null;
        System.out.println(info);

    }

    @Test
    public void test002() {
        //System.out.println(systemInfoRepository.findTopByOrderByCreateDateDesc());
    }

}
