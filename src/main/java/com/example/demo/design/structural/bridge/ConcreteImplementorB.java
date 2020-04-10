package com.example.demo.design.structural.bridge;

/**
 * @author zhang
 */
public class ConcreteImplementorB implements Implementor {
    @Override
    public void operational() {
        System.out.println("具体实现化角色B");
    }
}
