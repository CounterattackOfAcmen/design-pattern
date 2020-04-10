package com.example.demo.design.structural.flyweight;

/**
 * @author zhang
 */
public class FlyweightClient {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight f01 = flyweightFactory.getFlyweights("a");
        Flyweight f02 = flyweightFactory.getFlyweights("a");
        Flyweight f03 = flyweightFactory.getFlyweights("a");
        Flyweight f11 = flyweightFactory.getFlyweights("b");
        Flyweight f12 = flyweightFactory.getFlyweights("b");

        f01.operation(new UnsharedFlyweight("第1次"));
        f02.operation(new UnsharedFlyweight("第2次"));
        f03.operation(new UnsharedFlyweight("第3次"));
        f11.operation(new UnsharedFlyweight("第1次"));
        f12.operation(new UnsharedFlyweight("第2次"));
    }
}
