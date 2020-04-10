package com.example.demo.design.structural.adapter.twoway;

import com.example.demo.design.structural.adapter.ITarget;

/**
 * @author zhang
 */
public class TargetRealize implements ITarget {
    @Override
    public void request() {
        System.out.println("目标方法。");
    }
}
