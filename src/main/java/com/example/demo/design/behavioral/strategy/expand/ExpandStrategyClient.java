package com.example.demo.design.behavioral.strategy.expand;

import com.example.demo.design.behavioral.strategy.ConcreteStrategyA;
import com.example.demo.design.behavioral.strategy.ConcreteStrategyB;

/**
 * @author zhang
 */
public class ExpandStrategyClient {

    public static void main(String[] args) {
        ExpandContextFactory contextFactory = new ExpandContextFactory();
        try {
            contextFactory.strategyMethod(ConcreteStrategyA.class);
            System.out.println("----------------------");
            contextFactory.strategyMethod(ConcreteStrategyB.class);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
