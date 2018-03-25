package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * UserLoginRecord
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/3/19 0:15
 * Version: 0.1
 * Info: @TODO:...
 */

@Data
public class UserLoginRecord {

    String id;

    private String userId;
    private String username;
    private String ip;
    /**
     * 登录时间
     */

    private String date;
    /**
     * 登录方式
     */
    private int type;
    /**
     * 登录状态
     * 0 为成功
     * 1 为失败
     */
    private int loginStatus;


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
