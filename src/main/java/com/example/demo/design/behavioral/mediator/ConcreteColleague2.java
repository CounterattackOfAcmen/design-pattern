package com.example.demo.design.behavioral.mediator;

public class ConcreteColleague2 extends AbstractColleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        mediator.relay(this);
    }
}
