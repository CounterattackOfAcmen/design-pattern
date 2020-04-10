package com.example.demo.design.behavioral.command;

public class CommandClient {

    public static void main(String[] args) {
        ReceiverA receiverA = new ReceiverA();
        Command commandA = new ConcreteCommandA(receiverA);
        Invoker invoker = new Invoker(commandA);
        invoker.cell();
        System.out.println("------------------------");
        ReceiverB receiverB = new ReceiverB();
        Command commandB = new ConcreteCommandB(receiverB);
        invoker.setCommand(commandB);
        invoker.cell();
    }

}
