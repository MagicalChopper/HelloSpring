package com.coder.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 元注解：描述自定义的注解的注解
 */

/**
 *
 */
@Target(ElementType.FIELD)
public @interface Test {
    public String value();
    public String desc() default "这是一个描述";
}
