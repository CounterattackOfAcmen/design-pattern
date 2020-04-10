package com.example.demo.design.structural.proxy.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProxyAspect {

    @Pointcut("execution(* com.example.demo.design.structural.proxy.aspectj.AspectTarget.show(..))")
    public void cut() {

    }

    @Around("cut()")
    public Object aspectAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前置");
        try {
            joinPoint.proceed();
        } catch (Exception e) {
            System.out.println("异常");
        } finally {
            System.out.println("返回");
        }
        System.out.println("后置");
        return null;
    }
}
