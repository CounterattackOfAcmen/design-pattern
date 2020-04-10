package com.example.demo.design.structural.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author zhang
 */
public class ProxyTargetFactory {

    public static Object getProxy(ITarget target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new ProxyHandler(target));
    }
}
