package com.coder.iocaop.aop.theory.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl() ;
        InvocationHandler handler = new UserInvocationHandler(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),handler);
        userServiceProxy.say("123");
    }
}
