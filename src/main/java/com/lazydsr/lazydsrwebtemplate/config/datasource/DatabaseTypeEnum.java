package com.lazydsr.lazydsrwebtemplate.config.datasource;

/**
 * DatabaseTypeEnum
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.datasource
 * Created by Lazy on 2018/3/9 22:16
 * Version: 0.1
 * Info: 数据库枚举
 */
public enum DatabaseTypeEnum {
    MYSQL(0, "MYSQL", "com.mysql.jdbc.Driver"),
    ORACLE(1, "ORACLE", "oracle.jdbc.OracleDriver");

    private int code;
    private String dbType;
    private String driverClassName;

    private DatabaseTypeEnum(int code, String dbType, String driverClassName) {
        this.dbType = dbType;
        this.code = code;
    }

    public static String getDbTypeByCode(int code) {
        for (DatabaseTypeEnum databaseTypeEnum : DatabaseTypeEnum.values()) {
            if (databaseTypeEnum.getCode() == code) {
                return databaseTypeEnum.getDbType();
            }
        }
        return "";
    }

    public static String getDriverClassNameByDbType(String dbType) {
        for (DatabaseTypeEnum databaseTypeEnum : DatabaseTypeEnum.values()) {
            if (databaseTypeEnum.dbType.equals(dbType)) {
                return databaseTypeEnum.getDriverClassName();
            }
        }
        return "";
    }
    //public static String getName(int index) {
    //    for (Color c : Color.values()) {
    //        if (c.getIndex() == index) {
    //            return c.name;
    //        }
    //    }
    //    return null;
    //}

    public String getDbType() {
        return dbType;
    }

    public int getCode() {
        return code;
    }

    public String getDriverClassName() {
        return driverClassName;
    }
}
