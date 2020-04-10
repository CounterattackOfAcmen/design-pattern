package com.example.demo.design.behavioral.chain;

public class ConcreteHandler1 extends AbstractHandler {
    @Override
    public void handleRequest(Object object) {
        if ("one".equals(object)) {
            System.out.println("具体处理者1，处理请求。");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(object);
            } else {
                System.out.println("无人处理该请求。");
            }
        }
    }
}
