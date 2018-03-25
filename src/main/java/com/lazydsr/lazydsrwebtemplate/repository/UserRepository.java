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
}
