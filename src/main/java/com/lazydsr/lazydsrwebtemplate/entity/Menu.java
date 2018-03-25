package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.lazydsrwebtemplate.base.STATICVALUE;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Menu
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.entity
 * Created by Lazy on 2018/3/19 15:34
 * Version: 0.1
 * Info:菜单table
 * <p>
 * "F_ModuleId": "2",
 * "F_ParentId": "1",
 * "F_EnCode": "AreaManage",
 * "F_FullName": "常用元素",
 * "F_Icon": "fa fa-leaf",
 * "F_UrlAddress": "/basic/index/indexIframe2",
 * "F_Target": "iframe",
 * "F_IsMenu": 1,
 * "F_AllowExpand": 1,
 * "F_IsPublic": 0,
 * "F_AllowEdit": null,
 * "F_AllowDelete": null,
 * "F_SortCode": 1,
 * "F_DeleteMark": 0,
 * "F_EnabledMark": 1,
 * "F_Description": "常用元素",
 * "F_CreateDate": "2015-11-12 14:38:20",
 * "F_CreateUserId": "System",
 * "F_CreateUserName": "超级管理员",
 * "F_ModifyDate": "2016-04-29 14:05:33",
 * "F_ModifyUserId": "System",
 * "F_ModifyUserName": "超级管理员"
 */

@Data
public class Menu {

    private String id;
    private String name;
    private String enName;
    private String description;
    private String parentId;
    private String icon;
    private String url;
    private String target;
    private int publics = STATICVALUE.ENABLE;
    private int allowEdit = STATICVALUE.ENABLE;
    private int allowDelete = STATICVALUE.ENABLE;
    private double ordernum = 1000;


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
