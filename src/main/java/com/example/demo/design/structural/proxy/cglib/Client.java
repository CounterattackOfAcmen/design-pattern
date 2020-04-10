package com.example.demo.design.structural.proxy.cglib;

/**
 * @author zhang
 */
public class Client {

    public static void main(String[] args) {
        Target target = new Target();
        Target proxy = (Target) CglibTargetFactory.getProxy(target);
        proxy.show("[" + target.getClass() + "]已被[" + proxy.getClass() + "]代理。");
    }
}
