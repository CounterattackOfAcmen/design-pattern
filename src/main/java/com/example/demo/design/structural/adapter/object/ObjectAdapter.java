package com.example.demo.design.structural.adapter.object;

import com.example.demo.design.structural.adapter.Adaptee;
import com.example.demo.design.structural.adapter.ITarget;

/**
 * @author zhang
 */
public class ObjectAdapter implements ITarget {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public Adaptee getAdaptee() {
        return adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
