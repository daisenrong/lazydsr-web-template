package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.id.UtilUUId;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_user_login_record")
@Data
public class UserLoginRecord {
    @Id
    private String id = UtilUUId.getId();

    private String userId;

    private String username;

    private String ip;

    private String date;

    private Integer type;

    private Integer loginStatus;

    private String creator;

    private String createDate = UtilDateTime.getCurrDateTime();

    private String modifier;

    private String modifyDate = UtilDateTime.getCurrDateTime();

    private Integer status = 0;


}