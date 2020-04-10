package com.example.demo.design.structural.bridge;

import com.example.demo.design.structural.bridge.adapter.BridgeAdaptee;
import com.example.demo.design.structural.bridge.adapter.BridgeAdapter;

/**
 * @author zhang
 */
public class BridgeClient {

    public static void main(String[] args) {
        System.out.println("--------------------桥接---------------------");
        Implementor implementor = new ConcreteImplementorB();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
        System.out.println("------------------桥接+适配------------------");
        Implementor implementor2 = new BridgeAdapter(new BridgeAdaptee());
        Abstraction abstraction2 = new RefinedAbstraction(implementor2);
        abstraction2.operation();
    }
}
