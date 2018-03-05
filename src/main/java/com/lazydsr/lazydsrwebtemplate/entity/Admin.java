package com.lazydsr.lazydsrwebtemplate.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Admin
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/3/5 22:48
 * Version: 0.1
 * Info: @TODO:...
 */
@Entity
@Data
public class Admin {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
}
