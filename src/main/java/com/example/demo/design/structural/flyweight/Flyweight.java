package com.example.demo.design.structural.flyweight;

/**
 * @author zhang
 */
public interface Flyweight {

    /**
     * 享元角色方法
     * @param state 非享元角色
     */
    void operation(UnsharedFlyweight state);
}
