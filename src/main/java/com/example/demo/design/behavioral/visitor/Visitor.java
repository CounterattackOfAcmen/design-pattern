package com.example.demo.design.behavioral.visitor;

public interface Visitor {

    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
