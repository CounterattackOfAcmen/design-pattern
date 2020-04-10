package com.example.demo.design.structural.decorator;

/**
 * @author zhang
 */
public class ConcreteDecorator1 extends AbstractDecorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    private void addedFunction() {
        System.out.println("附加修饰1 ");
    }
}
