package com.example.demo.design.structural.decorator;

/**
 * @author zhang
 */
public abstract class AbstractDecorator implements Component {

    private Component component;

    public AbstractDecorator(Component component) {
        this.component = component;
    }

    public Component getComponent() {
        return component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
