package com.example.demo.design.structural.proxy.statical;

public class RealSubject implements Subject {
    @Override
    public void request(String message) {
        System.out.println(message);
    }
}
