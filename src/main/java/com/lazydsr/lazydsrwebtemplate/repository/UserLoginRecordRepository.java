package com.lazydsr.lazydsrwebtemplate.repository;

import com.lazydsr.lazydsrwebtemplate.entity.UserLoginRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserLoginRecordRepository
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.repository
 * Created by Lazy on 2018/3/19 0:51
 * Version: 0.1
 * Info: @TODO:...
 */
public interface UserLoginRecordRepository extends JpaRepository<UserLoginRecord,String> {
}
