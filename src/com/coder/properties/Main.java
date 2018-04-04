package com.coder.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读properties文件
 *
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        FileInputStream fileinputStream = new FileInputStream("resources/test.properties");
        /**
         *load方法返回的是一个InputStream输入流对象
         * 同样用反射的方式也可以返回一个InputStream输入流对象
         * 测试未成功
         */
        properties.load(fileinputStream);
        System.out.println(properties.getProperty("url"));

    }

}
