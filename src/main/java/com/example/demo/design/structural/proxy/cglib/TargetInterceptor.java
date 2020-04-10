package com.example.demo.design.structural.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhang
 */
public class TargetInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("--------------------前置处理--------------------");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("--------------------后置处理--------------------");
        return result;
    }
}
