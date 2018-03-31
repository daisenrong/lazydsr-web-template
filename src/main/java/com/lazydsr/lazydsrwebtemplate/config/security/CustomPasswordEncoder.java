package com.lazydsr.lazydsrwebtemplate.config.security;

import com.lazydsr.util.MD5.UtilMD5;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * CustomPasswordEncoder
 * PROJECT_NAME: lazydsr-security
 * PACKAGE_NAME: com.lazydsr.security.browser
 * Created by Lazy on 2018/1/21 18:52
 * Version: 0.1
 * Info: 自定义密码验证规则
 */
@Slf4j
public class CustomPasswordEncoder implements PasswordEncoder {

    //用户输入的密码
    @Override
    public String encode(CharSequence rawPassword) {
        //log.error("encode:" + rawPassword.toString());
        return UtilMD5.getMD5UpCase(rawPassword.toString());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        log.error("matches1:" + rawPassword.toString());
        log.error("matches2:" + encodedPassword);
        if (rawPassword != null && !rawPassword.toString().equals("")) {
            if (encode(rawPassword).equals(encodedPassword))
                return true;
        }
        return false;
    }
}
