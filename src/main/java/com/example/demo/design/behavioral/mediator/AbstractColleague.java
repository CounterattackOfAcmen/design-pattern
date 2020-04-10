package com.example.demo.design.behavioral.mediator;

public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    abstract void receive();

    abstract void send();
}
