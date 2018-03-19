package com.lazydsr.lazydsrwebtemplate.repository;

import com.lazydsr.lazydsrwebtemplate.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * PermissionRepository
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.repository
 * Created by Lazy on 2018/3/18 15:19
 * Version: 0.1
 * Info: @TODO:...
 */
public interface PermissionRepository extends JpaRepository<Permission,String> {
    @Query(value = "SELECT " +
            " p.* " +
            " FROM sys_user u " +
            " LEFT JOIN sys_user_role sru ON u.id= sru.uid " +
            " LEFT JOIN sys_role r ON sru.rid=r.id " +
            " LEFT JOIN sys_permission_role spr ON spr.rid=r.id " +
            " LEFT JOIN sys_permission p ON p.id =spr.pid " +
            " WHERE u.id=?1", nativeQuery = true)
    List<Permission> findByUserId(String userId);
}
