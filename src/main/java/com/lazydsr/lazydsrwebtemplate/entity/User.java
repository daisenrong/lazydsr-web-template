package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


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
    @GenericGenerator(name = "Custom_UUID", strategy = "com.lazydsr.commons.util.CustomIdentifierGenerator")
    @GeneratedValue(generator = "Custom_UUID")
    @Column(length = 32)
    private String id;
    @Column(length = 100, nullable = false)
    private String name;
    @Column(length = 50)
    private String mobile;
    @Column(length = 100)
    private String address;


    private int status = STATICVALUE.ENABLE;


    private String creator;
    private String createDate = UtilDateTime.getCurrDateTime();
    private String modifier;
    private String modifyDate = UtilDateTime.getCurrDateTime();
    private int dataStatus = STATICVALUE.ENABLE;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

}
