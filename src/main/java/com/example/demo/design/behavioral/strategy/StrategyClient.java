package com.example.demo.design.behavioral.strategy;

/**
 * @author zhang
 */
public class StrategyClient {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.strategyMethod();
        System.out.println("----------------------");
        context.setStrategy(new ConcreteStrategyB());
        context.strategyMethod();
    }
}
