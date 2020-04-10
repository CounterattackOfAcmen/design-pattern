package com.example.demo.design.creational.builder;

public class BuilderClient {

    public static void main(String[] args) {
        AbstractBuilder builder = new ConcreteBuilder1();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
        director = new Director(new ConcreteBuilder2());
        product = director.construct();
        product.show();
    }
}
