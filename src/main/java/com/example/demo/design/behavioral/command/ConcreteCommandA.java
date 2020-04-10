package com.example.demo.design.behavioral.command;

public class ConcreteCommandA implements Command {

    private ReceiverA receiver;

    public ConcreteCommandA(ReceiverA receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
