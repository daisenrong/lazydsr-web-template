package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.id.UtilUUId;
import lombok.Data;

import javax.persistence.*;
;

/**
 * User
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/3/5 22:23
 * Version: 0.1
 * Info: @TODO:...
 */
@Entity
@Data
public class User {
    @Id
    @Column(length = 100)
    private String id;
    @Column(length = 100,nullable = false)
    private String name;

    public User() {
    }

    public User(String name) {
        this.id = UtilUUId.getId();
        this.name = name;
    }

}
