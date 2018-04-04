package com.coder.iocaop.service;

import org.springframework.stereotype.Service;

/**
 * 测试包扫描 注解
 * 需要的jar：
 * aopalliance
 * aspectjweaver
 * spring-aop
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String say(String words) {
        System.out.println(words);
        return words;
    }
}
