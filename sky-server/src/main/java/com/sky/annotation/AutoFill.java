package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Classname: AutoFill
 * Package: com.sky.annotation
 * Description:自定义注解，用于标识某个方法的自动填充
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 15:35
 * @Version: v1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //数据库操作类型update、insert
    OperationType value();
}
