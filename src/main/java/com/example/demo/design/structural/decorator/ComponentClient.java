package com.example.demo.design.structural.decorator;

/**
 * @author zhang
 */
public class ComponentClient {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        System.out.println("-------------------------");
        Component decorator1 = new ConcreteDecorator1(component);
        Component decorator2 = new ConcreteDecorator2(decorator1);
        Component decorator3 = new ConcreteDecorator3(decorator2);
        decorator3.operation();
    }
}
