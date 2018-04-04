package com.coder.iocaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 基于Spring注解使用aop
 */
@Component
@Aspect //声明切面
public class UserAspect {

    //拦截service包下的所有类的所有方法
    @Pointcut(value="execution(* com.coder.iocaop.service.*.*(..))")
    public void pointCut(){}


    //advice 干什么事情，什么时候干
    @Before(value = "pointCut()")
    public void doBefore(JoinPoint joinPoint){//JoinPoint连接点  代表pointCut()（连接的切点）的方法
        String name = joinPoint.getSignature().getName();//该方法的名称
        Object[] args = joinPoint.getArgs();//该方法的参数
        System.out.println(name+"--"+args.toString());
    }

    @After(value = "pointCut()")
    public void doAfter(JoinPoint joinPoint){//JoinPoint连接点  代表pointCut()（连接的切点）的方法
        String name = joinPoint.getSignature().getName();//该方法的名称
        Object[] args = joinPoint.getArgs();//该方法的参数
        System.out.println(name+"--"+args.toString());
    }

    @AfterReturning(value="pointCut()",returning="result")
    public void afterReturning(JoinPoint joinPoint,Object result){//JoinPoint连接点  代表pointCut()（连接的切点）的方法
        System.out.println(result);//输出方法返回值
    }

    //抛异常
//    @AfterThrowing(value="pointCut()")
//    public void afterThrowing(){
//    }

    @Around(value="pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        /**
         * 只有执行了这个方法，service层的方法才会执行加入这行注释，service层则不会执行
         * 而且这个方法会阻止返回值的返回
         */
        proceedingJoinPoint.proceed();
    }

}
