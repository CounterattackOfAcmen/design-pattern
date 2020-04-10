package com.example.demo.design.behavioral.visitor;

public class VisitorClient {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        structure.accept(visitor);
        System.out.println("--------------------------");
        visitor = new ConcreteVisitorB();
        structure.accept(visitor);
    }
}
