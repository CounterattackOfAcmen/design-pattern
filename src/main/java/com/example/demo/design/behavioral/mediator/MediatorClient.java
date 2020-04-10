package com.example.demo.design.behavioral.mediator;

public class MediatorClient {

    public static void main(String[] args) {
        AbstractMediator mediator = new ConcreteMediator();
        AbstractColleague colleague1 = new ConcreteColleague1();
        AbstractColleague colleague2 = new ConcreteColleague2();
        mediator.register(colleague1);
        mediator.register(colleague2);
        colleague1.send();
        System.out.println("---------------------------------");
        colleague2.send();
    }
}
