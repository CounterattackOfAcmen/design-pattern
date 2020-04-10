package com.example.demo.design.behavioral.template;

/**
 * @author zhang
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("父类中抽象方法1被实现");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("父类中抽象方法2被实现");
    }

    @Override
    public void hookMethod1() {
        System.out.println("钩子方法1被重写。");
    }

    @Override
    public boolean hookMethod2() {
        return true;
    }
}
