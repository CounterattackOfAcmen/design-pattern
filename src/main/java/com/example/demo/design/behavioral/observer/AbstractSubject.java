package com.example.demo.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject {

    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    abstract void notifyObserver();
}
