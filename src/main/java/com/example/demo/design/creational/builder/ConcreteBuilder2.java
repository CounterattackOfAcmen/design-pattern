package com.example.demo.design.creational.builder;

public class ConcreteBuilder2 extends AbstractBuilder {
    @Override
    public AbstractBuilder buildPartA() {
        product.setPartA("A");
        return this;
    }

    @Override
    public AbstractBuilder buildPartB() {
        product.setPartB("B");
        return this;
    }

    @Override
    public AbstractBuilder buildPartC() {
        product.setPartC("C");
        return this;
    }
}
