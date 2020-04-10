package com.example.demo.design.structural.adapter.twoway;

import com.example.demo.design.structural.adapter.Adaptee;
import com.example.demo.design.structural.adapter.ITarget;

/**
 * @author zhang
 */
public class TwoWayAdapter extends Adaptee implements ITarget {

    private Adaptee adaptee;

    private ITarget target;

    public TwoWayAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public TwoWayAdapter(ITarget target) {
        this.target = target;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    @Override
    public void specificRequest() {
        target.request();
    }

    public Adaptee getAdaptee() {
        return adaptee;
    }

    public ITarget getTarget() {
        return target;
    }
}
