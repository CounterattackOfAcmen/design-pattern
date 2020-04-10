package com.example.demo.design.creational.builder;

public class ConcreteBuilder1 extends AbstractBuilder {
    @Override
    public AbstractBuilder buildPartA() {
        product.setPartA("构建PartA");
        return this;
    }

    @Override
    public AbstractBuilder buildPartB() {
        product.setPartB("构建PartB");
        return this;
    }

    @Override
    public AbstractBuilder buildPartC() {
        product.setPartC("构建PartC");
        return this;
    }
}
