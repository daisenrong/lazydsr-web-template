package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.id.UtilUUId;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "sys_user")
@Data
public class User implements Serializable {
    @Id
    private String id = UtilUUId.getId();

    private String name;

    private String username;

    private String password;

    private String workcode;

    private Integer sumPasswordWrong;

    private Integer passwordLock;

    private String oldPassword1;

    private String oldPassword2;

    private String email;

    private String mobile;

    private String telphone;

    private String organization;

    private String company;

    private String department;

    private String idCard;

    private String currentLoginDate;

    private String lastLoginDate;

    private Double orderNum = 1000.0;

    private Integer accountType;

    private String creator;

    private String createDate = UtilDateTime.getCurrDateTime();

    private String modifier;

    private String modifyDate = UtilDateTime.getCurrDateTime();

    private Integer status = 0;


}