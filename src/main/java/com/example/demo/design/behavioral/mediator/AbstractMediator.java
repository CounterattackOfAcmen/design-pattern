package com.example.demo.design.behavioral.mediator;

public abstract class AbstractMediator {

    abstract void register(AbstractColleague colleague);

    abstract void relay(AbstractColleague colleague);
}
