package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.id.UtilUUId;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OtherSystem
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/5/13 19:39
 * Version: 0.1
 * Info: @TODO:...
 */
@Table(name = "sys_otherSystem")
@Data
public class OtherSystem {
    @Id
    private String id = UtilUUId.getId();

    private String name;

    private String ip;

    private String port;

    private String address;

    private String creator;

    private String createDate = UtilDateTime.getCurrDateTime();

    private String modifier;

    private String modifyDate = UtilDateTime.getCurrDateTime();

    private Integer status = 0;
}
