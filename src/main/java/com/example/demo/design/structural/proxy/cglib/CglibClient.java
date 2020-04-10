package com.example.demo.design.structural.proxy.cglib;

/**
 * @author zhang
 */
public class CglibClient {

    public static void main(String[] args) {
        CglibTarget target = new CglibTarget();
        CglibTarget proxy = (CglibTarget) CglibTargetFactory.getProxy(target);
        proxy.show("[" + target.getClass() + "]已被[" + proxy.getClass() + "]代理。");
    }
}
