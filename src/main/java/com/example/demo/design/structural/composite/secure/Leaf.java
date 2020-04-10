package com.example.demo.design.structural.composite.secure;

/**
 * @author zhang
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("操作树叶节点：" + this.name);
    }
}
