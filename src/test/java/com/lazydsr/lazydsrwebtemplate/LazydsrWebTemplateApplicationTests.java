package com.lazydsr.lazydsrwebtemplate;

import com.lazydsr.lazydsrwebtemplate.dao.UserDao;
import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import com.lazydsr.lazydsrwebtemplate.entity.Menu;
import com.lazydsr.lazydsrwebtemplate.entity.User;
import com.lazydsr.lazydsrwebtemplate.repository.DataSourceInfoRepository;
import com.lazydsr.lazydsrwebtemplate.repository.SystemInfoRepository;
import com.lazydsr.lazydsrwebtemplate.repository.UserRepository;
import com.lazydsr.lazydsrwebtemplate.service.MenuService;
import com.lazydsr.lazydsrwebtemplate.service.UserService;
import com.lazydsr.lazydsrwebtemplate.util.SpringContextUtil;
import com.lazydsr.util.time.UtilDateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LazydsrWebTemplateApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserDao userDao;
    @Autowired
    private DataSourceInfoRepository dataSourceInfoRepository;
    @Autowired
    private SystemInfoRepository systemInfoRepository;
    @Autowired
    private MenuService menuService;

    @Test
    public void contextLoads002() {
        UserService userService = SpringContextUtil.getBean(UserService.class);
        System.out.println(userService);

    }

    @Test
    public void contextLoads() {
        User user1 = new User();
        user1.setName("admin");
        user1.setUsername("admin");
        user1.setPassword("admin");
        user1.setMobile("1111");
        User user = userRepository.save(user1);
        System.out.println(user);

        userRepository.findAll().stream().forEach(u -> System.out.println(u));

    }

    @Test
    public void menuAdd() {
        Menu menu = new Menu();
        menu.setParentId("6KTEKT24AUNYR8EJ8SQN4378PJ34J91Z");
        menu.setName("菜单管理");
        menu.setEnName("Menu Manager");
        menu.setDescription("菜单管理");
        menu.setIcon("fa fa-bars");
        menu.setTarget("iframe");
        menu.setUrl("/home");
        menuService.save(menu);
    }

    @Test
    public void contextLoads1() {
        //User user = userRepository.save(new User("aa"));
        //System.out.println(user);

        //userRepository.findByNameLike("aa").stream().forEach(u -> System.out.println(u));

    }

    @Test
    public void contextLoads2() {
        //User user = userRepository.save(new User("aa"));
        //System.out.println(user);

        //userRepository.findByNameLike("%a%").stream().forEach(u -> System.out.println(u));

    }

    @Test
    public void contextLoads3() {
        //User user = userRepository.save(new User("aa"));
        //System.out.println(user);

        //userRepository.findByNameLikeCus("aa").stream().forEach(u-> System.out.println(u));
        //userRepository.findByNameLikeCus1("aa").stream().forEach(u-> System.out.println(u));
        //userRepository.findByNameLikeCus2("aa").stream().forEach(u-> System.out.println(u));
        //System.out.println("-------------");
        userDao.findbyNameJdbc("aa").stream().forEach(u -> System.out.println(u));

    }

    @Test
    public void contextLoads4() {
        DataSourceInfo dataSourceInfo = new DataSourceInfo();
        dataSourceInfo.setName(UtilDateTime.getCurrSecond() + "");
        DataSourceInfo info = dataSourceInfoRepository.save(dataSourceInfo);
        System.out.println(info);

    }

    @Test
    public void test002() {
        System.out.println(systemInfoRepository.findTopByOrderByCreateDateDesc());
    }

}
