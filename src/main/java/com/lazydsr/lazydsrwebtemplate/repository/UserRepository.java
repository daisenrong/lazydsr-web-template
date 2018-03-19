package com.lazydsr.lazydsrwebtemplate.repository;

import com.lazydsr.lazydsrwebtemplate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserRepository
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.repository
 * Created by Lazy on 2018/3/5 22:27
 * Version: 0.1
 * Info: @TODO:...
 */
public interface UserRepository extends JpaRepository<User, String> {

    public User findByUsername(String username);

    public User findByUsernameAndPassword(String username, String password);


    //public List<User> findByNameLike(String name);
    //
    //@Query("select u from User u where u.name like %:username%")
    //public List<User> findByNameLikeCus(@Param("username") String username);
    //
    //@Query("select u from User u where u.name like %?1%")
    //public List<User> findByNameLikeCus1(String username);
    //
    //@Query(value = "SELECT * FROM user t WHERE t.name LIKE %?1%", nativeQuery = true)
    //public List<User> findByNameLikeCus2(String username);
}
