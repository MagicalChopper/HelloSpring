package com.coder.iocaop.aop.theory.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 自定义的InvocationHandler（拦截器）
 */
public class UserInvocationHandler implements InvocationHandler {
    private Object target;

    public UserInvocationHandler(){};

    public UserInvocationHandler(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前"+method.getName());
        Object obj = method.invoke(target,args);
        System.out.println("调用后"+method.getName());

        System.out.println(obj);
        return obj;
    }
}
