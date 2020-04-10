package com.example.demo.design.structural.composite.secure;

/**
 * @author zhang
 */
public class CompositeClient {

    public static void main(String[] args) {
        Composite c0 = new Composite();
        Composite c1 = new Composite();
        Component leaf1 = new Leaf("a");
        Component leaf2 = new Leaf("b");
        Component leaf3 = new Leaf("c");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}
