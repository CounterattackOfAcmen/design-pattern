package com.example.demo.design.behavioral.template;

/**
 * @author zhang
 */
public abstract class AbstractClass {

    /**
     * 模板方法
     */
    public void templateMethod() {
        abstractMethod1();
        hookMethod1();
        if (hookMethod2()) {
            specificMethod();
        }
        abstractMethod2();
    }

    /**
     * 具体方法
     */
    public void specificMethod() {
        System.out.println("抽象类中具体方法被调用。");
    }

    /**
     * 钩子方法1
     */
    public void hookMethod1() {
        // todo 钩子空方法
    }

    /**
     * 钩子方法2
     *
     * @return 判断结果
     */
    public boolean hookMethod2() {
        return false;
    }

    /**
     * 抽象方法1
     */
    public abstract void abstractMethod1();

    /**
     * 抽象方法2
     */
    public abstract void abstractMethod2();

}
