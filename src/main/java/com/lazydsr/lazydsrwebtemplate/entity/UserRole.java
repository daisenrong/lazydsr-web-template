package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * UserRole
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.po
 * Created by Lazy on 2018/1/9 22:32
 * Version: 0.1
 * Info: @TODO:...
 */
@Data
@Entity
@Table(name = "sysUserRole")
public class UserRole {
    @Id
    @GenericGenerator(name = "Custom_UUID", strategy = "com.lazydsr.commons.util.CustomIdentifierGenerator")
    @GeneratedValue(generator = "Custom_UUID")
    @Column(length = 32)
    String id;
    String uid;
    String rid;


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
    @Column(length = 19)
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
    @Column(length = 19)
    private String modifyDate = UtilDateTime.getCurrDateTime();
    /**
     * 数据状态
     * 0 为正常
     * 1 为删除
     */
    @Column(name = "dataStatus")
    private int dataStatus = STATICVALUE.ENABLE;
}
