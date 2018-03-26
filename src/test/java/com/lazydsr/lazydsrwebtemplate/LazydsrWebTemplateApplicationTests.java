package com.lazydsr.lazydsrwebtemplate;

import com.lazydsr.lazydsrwebtemplate.config.system.SystemInfoConfiguration;
import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import com.lazydsr.lazydsrwebtemplate.entity.SystemInfo;
import com.lazydsr.lazydsrwebtemplate.entity.User;
import com.lazydsr.lazydsrwebtemplate.mapper.UserMapper;
import com.lazydsr.lazydsrwebtemplate.service.MenuService;
import com.lazydsr.lazydsrwebtemplate.service.SystemInfoService;
import com.lazydsr.lazydsrwebtemplate.service.UserService;
import com.lazydsr.lazydsrwebtemplate.util.SpringContextUtil;
import com.lazydsr.util.id.UtilUUId;
import com.lazydsr.util.time.UtilDateTime;
import org.hyperic.sigar.SigarException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.UnknownHostException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LazydsrWebTemplateApplicationTests {

    @Autowired
    private MenuService menuService;
    @Autowired
    private UserMapper userMapper;
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
    public void menuAdd() {
        for (int i=0;i<1000;i++){

            Menu menu = new Menu();
            menu.setParentId("6KTEKT24AUNYR8EJ8SQN4378PJ34J91Z");
            menu.setName("用户管理"+i);
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
        DataSourceInfo info =null;
        System.out.println(info);

    }

    @Test
    public void test002() {
        //System.out.println(systemInfoRepository.findTopByOrderByCreateDateDesc());
    }

}
