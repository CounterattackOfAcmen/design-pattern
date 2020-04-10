package com.example.demo.design.behavioral.observer;

public class ConcreteSubject extends AbstractSubject {


    @Override
    void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("-----------------");
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
