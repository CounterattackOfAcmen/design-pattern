package com.example.demo.design.structural.adapter.object;

import com.example.demo.design.structural.adapter.Adaptee;
import com.example.demo.design.structural.adapter.ITarget;

/**
 * @author zhang
 */
public class ObjectAdapterClient {

    public static void main(String[] args) {
        ITarget target = new ObjectAdapter(new Adaptee());
        target.request();
    }
}
