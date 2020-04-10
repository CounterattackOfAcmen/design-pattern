package com.example.demo.design.structural.composite.secure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang
 */
public class Composite implements Component {

    private List<Component> children = new ArrayList<> ();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public Component getChild(int t) {
        return children.get(t);
    }

    @Override
    public void operation() {
        System.out.println("操作树枝节点。");
        for (Component child : children) {
            child.operation();
        }
    }
}
