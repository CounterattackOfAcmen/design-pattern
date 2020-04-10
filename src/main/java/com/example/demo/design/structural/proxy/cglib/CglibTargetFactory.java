package com.example.demo.design.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author zhang
 */
public class CglibTargetFactory {

    public static Object getProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new TargetInterceptor());
        return enhancer.create();
    }
}
