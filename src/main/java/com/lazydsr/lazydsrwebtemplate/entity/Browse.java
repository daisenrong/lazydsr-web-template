package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.id.UtilUUId;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Browse
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/4/23 22:21
 * Version: 0.1
 * Info: @TODO:...
 */
@Data
@Table(name = "sys_browse")
public class Browse {
    @Id
    private String id = UtilUUId.getId();
    //该字段需要唯一，需要通过它调用浏览框
    private String name;

    private String tablename;

    private String description;




    private String creator;

    private String createDate = UtilDateTime.getCurrDateTime();

    private String modifier;

    private String modifyDate = UtilDateTime.getCurrDateTime();

    private Integer status = 0;

}
