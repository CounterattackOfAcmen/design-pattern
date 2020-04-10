package com.example.demo.design.structural.adapter.clazz;

import com.example.demo.design.structural.adapter.ITarget;

/**
 * @author zhang
 */
public class ClassAdapterClient {

    public static void main(String[] args) {
        ITarget target = new ClassAdapter();
        target.request();
    }
}
