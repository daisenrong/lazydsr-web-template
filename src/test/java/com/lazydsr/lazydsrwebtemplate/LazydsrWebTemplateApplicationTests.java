package com.lazydsr.lazydsrwebtemplate;

import com.lazydsr.lazydsrwebtemplate.dao.UserDao;
import com.lazydsr.lazydsrwebtemplate.entity.DataSourceInfo;
import com.lazydsr.lazydsrwebtemplate.entity.User;
import com.lazydsr.lazydsrwebtemplate.repository.DataSourceInfoRepository;
import com.lazydsr.lazydsrwebtemplate.repository.SystemInfoRepository;
import com.lazydsr.lazydsrwebtemplate.repository.UserRepository;
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

    @Test
    public void contextLoads002() {
        UserService userService = SpringContextUtil.getBean(UserService.class);
        System.out.println(userService);

    }

    @Test
    public void contextLoads() {
        User user = userRepository.save(new User("aa"));
        System.out.println(user);

        userRepository.findAll().stream().forEach(u -> System.out.println(u));

    }

    @Test
    public void contextLoads1() {
        User user = userRepository.save(new User("aa"));
        System.out.println(user);

        //userRepository.findByNameLike("aa").stream().forEach(u -> System.out.println(u));

    }

    @Test
    public void contextLoads2() {
        User user = userRepository.save(new User("aa"));
        System.out.println(user);

        userRepository.findByNameLike("%a%").stream().forEach(u -> System.out.println(u));

    }

    @Test
    public void contextLoads3() {
        User user = userRepository.save(new User("aa"));
        System.out.println(user);

        //userRepository.findByNameLikeCus("aa").stream().forEach(u-> System.out.println(u));
        //userRepository.findByNameLikeCus1("aa").stream().forEach(u-> System.out.println(u));
        //userRepository.findByNameLikeCus2("aa").stream().forEach(u-> System.out.println(u));
        //System.out.println("-------------");
        userDao.findbyNameJdbc("aa").stream().forEach(u -> System.out.println(u));

    }
    @Test
    public void contextLoads4() {
        DataSourceInfo dataSourceInfo =new DataSourceInfo();
        dataSourceInfo.setName(UtilDateTime.getCurrSecond()+"");
        DataSourceInfo info = dataSourceInfoRepository.save(dataSourceInfo);
        System.out.println(info);

    }
    @Test
    public void test002(){
        System.out.println(systemInfoRepository.findTopByOrderByCreateDateDesc());
    }

}
