package com.example.demo.design.behavioral.template;

/**
 * @author zhang
 */
public class TemplateMethodClient {

    public static void main(String[] args) {
        AbstractClass abs = new ConcreteClass();
        abs.templateMethod();
    }
}
