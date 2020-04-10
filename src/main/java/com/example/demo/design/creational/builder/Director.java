package com.example.demo.design.creational.builder;

public class Director {

    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public Product construct() {
        return builder.buildPartA().buildPartB().buildPartC()
                .getResult();
    }
}
