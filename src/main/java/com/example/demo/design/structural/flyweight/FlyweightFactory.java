package com.example.demo.design.structural.flyweight;

import java.util.HashMap;

/**
 * @author zhang
 */
public class FlyweightFactory {

    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweights(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight=new ConcreteFlyweight1(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
