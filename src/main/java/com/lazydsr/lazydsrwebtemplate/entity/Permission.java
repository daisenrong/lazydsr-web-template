package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * PermissionDao
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.po
 * Created by Lazy on 2018/1/10 21:48
 * Version: 0.1
 * Info:权限po
 */
@Data

public class Permission {

    String id;
    String name;
    String url;
    String pid;
    String description;


    /**
     * 状态
     * 0  启用
     * 1  禁用
     */
    private int status = STATICVALUE.ENABLE;
    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private String createDate = UtilDateTime.getCurrDateTime();
    /**
     * 最后修改人
     */
    private String modifier;
    /**
     * 最后修改时间
     */

    private String modifyDate = UtilDateTime.getCurrDateTime();

}
