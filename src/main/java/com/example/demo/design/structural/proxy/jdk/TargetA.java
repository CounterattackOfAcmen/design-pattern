package com.example.demo.design.structural.proxy.jdk;

/**
 * @author zhang
 */
public class TargetA implements ITarget {

    @Override
    public void show(String message) {
        System.out.println("目标A：" + message);
    }

}
