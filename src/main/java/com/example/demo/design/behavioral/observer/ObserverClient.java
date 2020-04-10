package com.example.demo.design.behavioral.observer;

public class ObserverClient {

    public static void main(String[] args) {
        AbstractSubject subject=new ConcreteSubject();
        subject.add(new ConcreteObserver1());
        subject.add(new ConcreteObserver2());
        subject.notifyObserver();
    }
}
