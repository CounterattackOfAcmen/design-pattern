package com.example.demo.design.structural.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhang
 */
public class JdkProxyHandler implements InvocationHandler {

    private ITarget target;

    public JdkProxyHandler(ITarget target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--------------------前置处理--------------------");
        method.invoke(target, args);
        System.out.println("--------------------后置处理--------------------");
        return null;
    }

    public ITarget getTarget() {
        return target;
    }
}
