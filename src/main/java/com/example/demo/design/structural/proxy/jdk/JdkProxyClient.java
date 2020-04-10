package com.example.demo.design.structural.proxy.jdk;

/**
 * @author zhang
 */
public class JdkProxyClient {

    public static void main(String[] args) {
        ITarget target = new TargetB();
        ITarget proxy = (ITarget) ProxyTargetFactory.getProxy(target);
        proxy.show("[" + target.getClass() + "]已被[" + proxy.getClass() + "]代理。");
    }
}
