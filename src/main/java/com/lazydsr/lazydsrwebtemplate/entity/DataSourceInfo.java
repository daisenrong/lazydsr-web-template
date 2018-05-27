package com.lazydsr.lazydsrwebtemplate.entity;

import com.lazydsr.util.id.UtilUUId;
import com.lazydsr.util.time.UtilDateTime;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "sys_datasourceinfo")
@Data
public class DataSourceInfo implements Serializable {
    @Id
    private String id = UtilUUId.getId();

    private String name;

    private String dbtype;

    private String address;

    private String prot;

    private String dbname;

    private String username;

    private String password;

    private Integer minActive = 0;

    private Integer maxActive = 0;

    private String creator;

    private String createDate = UtilDateTime.getCurrDateTime();

    private String modifier;

    private String modifyDate = UtilDateTime.getCurrDateTime();

    private Integer status = 0;


}