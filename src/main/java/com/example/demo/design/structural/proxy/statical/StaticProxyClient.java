package com.example.demo.design.structural.proxy.statical;

public class StaticProxyClient {

    public static void main(String[] args) {
        RealSubject target = new RealSubject();
        SubjectProxy proxy = new SubjectProxy(target);
        proxy.request("[" + target.getClass() + "]已被[" + proxy.getClass() + "]代理。");
    }
}
