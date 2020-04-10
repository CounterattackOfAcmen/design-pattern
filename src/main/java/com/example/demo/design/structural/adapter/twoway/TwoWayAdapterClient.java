package com.example.demo.design.structural.adapter.twoway;

import com.example.demo.design.structural.adapter.Adaptee;
import com.example.demo.design.structural.adapter.ITarget;

/**
 * @author zhang
 */
public class TwoWayAdapterClient {

    public static void main(String[] args) {
        System.out.println("目标通过双向适配器访问适配者：");
        Adaptee adaptee = new Adaptee();
        ITarget target = new TwoWayAdapter(adaptee);
        target.request();
        System.out.println("------------------------------");
        System.out.println("适配者通过双向适配器访问目标：");
        target = new TargetRealize();
        adaptee = new TwoWayAdapter(target);
        adaptee.specificRequest();
    }
}
