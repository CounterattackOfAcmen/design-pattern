package com.example.demo.design.structural.proxy.jdk;

/**
 * @author zhang
 */
public class TargetB implements ITarget {

    @Override
    public void show(String message) {
        System.out.println("目标B：" + message);
    }

}
