package com.coder.iocaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 基于xml使用aop
 */
public class Logger {


    public void doLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        proceedingJoinPoint.proceed();
    }

}
