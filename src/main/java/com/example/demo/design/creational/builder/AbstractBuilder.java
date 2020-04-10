package com.example.demo.design.creational.builder;

public abstract class AbstractBuilder {

    protected Product product = new Product();

    public abstract AbstractBuilder buildPartA();

    public abstract AbstractBuilder buildPartB();

    public abstract AbstractBuilder buildPartC();

    public Product getResult() {
        return this.product;
    }
}
