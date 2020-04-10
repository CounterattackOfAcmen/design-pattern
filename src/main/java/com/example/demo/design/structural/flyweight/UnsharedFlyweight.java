package com.example.demo.design.structural.flyweight;

/**
 * @author zhang
 */
public class UnsharedFlyweight {

    private String info;

    public UnsharedFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
