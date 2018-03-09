package com.lazydsr.lazydsrwebtemplate.config.datasource;

/**
 * DatasourceUtil
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.config.datasource
 * Created by Lazy on 2018/3/9 23:42
 * Version: 0.1
 * Info: @TODO:...
 */
public class DatasourceUtil {

    public static String getConnectUrl(String dbType, String address, String prot, String dbname, String enCoding, boolean useSSL) {
        //jdbc:mysql://localhost:3306/lazydsr-web-template?useUnicode=true&characterEncoding=utf-8&useSSL=false
        StringBuffer connectUrl = new StringBuffer();
        if (dbType.equalsIgnoreCase(DatabaseTypeEnum.MYSQL.getDbType())) {
            connectUrl.append("jdbc:mysql://")
                    .append(address).append(":")
                    .append(prot).append("/")
                    .append(dbname).append("?useUnicode=true")
                    .append("&characterEncoding=").append(enCoding);
            if (useSSL)
                connectUrl.append("&useSSL=true");
            else
                connectUrl.append("&useSSL=false");
        } else if (dbType.equalsIgnoreCase(DatabaseTypeEnum.ORACLE.getDbType())) {

        }


        return connectUrl.toString();
    }

}
