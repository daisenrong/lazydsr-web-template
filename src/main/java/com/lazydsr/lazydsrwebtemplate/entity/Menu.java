package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.id.UtilUUId;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sys_menu")
@Data
public class Menu {
    @Id
    private String id = UtilUUId.getId();

    private String name;

    private String enName;

    private String description;

    private String parentId;

    private String icon;

    private String url;

    private String target;

    private Integer publics = 0;

    private Integer allowEdit = 0;

    private Integer allowDelete = 0;

    private Double ordernum = 1000.0;

    private String creator;

    private String createDate = UtilDateTime.getCurrDateTime();

    private String modifier;

    private String modifyDate = UtilDateTime.getCurrDateTime();

    private Integer status = 0;


}