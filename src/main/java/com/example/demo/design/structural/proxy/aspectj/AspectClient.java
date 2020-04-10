package com.example.demo.design.structural.proxy.aspectj;

public class AspectClient {

    public static void main(String[] args) {
        AspectTarget target = new AspectTarget();
        target.show("AspectJ代理。");
    }
}
