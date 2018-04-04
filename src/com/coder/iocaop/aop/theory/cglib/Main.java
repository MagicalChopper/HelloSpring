package com.coder.iocaop.aop.theory.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(proxy);

        UserService userService = (UserService) enhancer.create();
        userService.say("123");
    }
}
