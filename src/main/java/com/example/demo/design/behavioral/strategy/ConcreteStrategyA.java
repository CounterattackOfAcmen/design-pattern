package com.example.demo.design.behavioral.strategy;

/**
 * @author zhang
 */
public class ConcreteStrategyA implements IStrategy {
    @Override
    public void strategyMethod() {
        System.out.println("策略A中策略方法被调用。");
    }
}
