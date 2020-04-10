package com.example.demo.design.structural.decorator;

/**
 * @author zhang
 */
public class ConcreteDecorator2 extends AbstractDecorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    private void addedFunction() {
        System.out.println("附加修饰2 ");
    }
}
