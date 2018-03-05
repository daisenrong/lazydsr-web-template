package com.lazydsr.lazydsrwebtemplate;

import com.lazydsr.lazydsrwebtemplate.entity.User;
import com.lazydsr.lazydsrwebtemplate.repository.UserRepository;
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
	@Test
	public void contextLoads() {
		User user = userRepository.save(new User("aa"));
		System.out.println(user);

		userRepository.findAll().stream().forEach(u-> System.out.println(u));

	}

}
