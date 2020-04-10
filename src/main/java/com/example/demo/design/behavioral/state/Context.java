package com.example.demo.design.behavioral.state;

public class Context {

    private AbstractState state;

    public Context() {
        this.state = new ConcreteStateA();
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void handle() {
        state.handle(this);
    }
}
