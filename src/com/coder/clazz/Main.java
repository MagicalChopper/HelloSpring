package com.coder.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Class.forName("com.coder.clazz.Demo");
        /**
         * 创建实例
         */
        Demo demo  = (Demo) clazz.newInstance();
        /**
         * 调用方法
         */
//        int x = demo.add(1,2);
//        System.out.println(x);
        /**
         * 操作属性
         */
//        Field field = clazz.getDeclaredField("name");
//        field.setAccessible(true);
//        field.set(demo,"lh");
//        System.out.println(field.get(demo));
        /**
         * 构造方法
         */
        Constructor constructor = clazz.getConstructor();
        System.out.println(constructor.getName());


    }
}
