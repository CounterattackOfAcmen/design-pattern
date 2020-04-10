package com.example.demo.design.behavioral.chain;

public abstract class AbstractHandler {

    private AbstractHandler next;

    public AbstractHandler getNext() {
        return next;
    }

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public abstract void handleRequest(Object object);
}
