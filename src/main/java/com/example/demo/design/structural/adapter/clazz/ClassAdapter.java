package com.example.demo.design.structural.adapter.clazz;

import com.example.demo.design.structural.adapter.Adaptee;
import com.example.demo.design.structural.adapter.ITarget;

/**
 * @author zhang
 */
public class ClassAdapter extends Adaptee implements ITarget {

    @Override
    public void request() {
        super.specificRequest();
    }

}
