package com.example.demo.design.behavioral.command;

public class ConcreteCommandB implements Command {

    private ReceiverB receiver;

    public ConcreteCommandB(ReceiverB receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
