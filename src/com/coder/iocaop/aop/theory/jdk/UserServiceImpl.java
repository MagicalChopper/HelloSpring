package com.coder.iocaop.aop.theory.jdk;

public class UserServiceImpl implements UserService{

    @Override
    public void say(String words) {
        System.out.println(words);
    }
}
