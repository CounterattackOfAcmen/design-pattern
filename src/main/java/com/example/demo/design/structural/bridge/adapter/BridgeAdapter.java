package com.example.demo.design.structural.bridge.adapter;

import com.example.demo.design.structural.bridge.ConcreteImplementorA;

/**
 * @author zhang
 */
public class BridgeAdapter extends ConcreteImplementorA {

    private BridgeAdaptee adaptee;

    public BridgeAdapter(BridgeAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    public BridgeAdaptee getAdaptee() {
        return adaptee;
    }

    @Override
    public void operational() {
       adaptee.specificRequest();
    }
}
