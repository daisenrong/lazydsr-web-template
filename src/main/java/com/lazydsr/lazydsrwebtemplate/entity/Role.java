package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Role
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.po
 * Created by Lazy on 2018/1/9 21:46
 * Version: 0.1
 * Info: 系统角色表
 */
@Data

@Table(name = "sysRole")
public class Role {

    String id;
    String name;
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
