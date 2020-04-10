package com.example.demo.design.structural.decorator;

/**
 * @author zhang
 */
public class ConcreteDecorator3 extends AbstractDecorator {

    public ConcreteDecorator3(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    private void addedFunction() {
        System.out.println("附加修饰3 ");
    }
}
