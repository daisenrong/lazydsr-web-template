package com.lazydsr.lazydsrwebtemplate.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * CostomId
 * PROJECT_NAME: lazydsr-web-template
 * PACKAGE_NAME: com.lazydsr.lazydsrwebtemplate.annotation
 * Created by Lazy on 2018/3/8 21:59
 * Version: 0.1
 * Info: @TODO:...
 */
@Target(FIELD)
@Retention(RUNTIME)
public @interface CostomId {
    String value() default "";
}
