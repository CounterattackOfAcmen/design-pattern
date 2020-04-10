package com.example.demo.design.behavioral.strategy;

/**
 * @author zhang
 */
public class ConcreteStrategyB implements IStrategy {
    @Override
    public void strategyMethod() {
        System.out.println("策略B中策略方法被调用。");
    }
}
