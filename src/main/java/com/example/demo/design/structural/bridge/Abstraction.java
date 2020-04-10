package com.example.demo.design.structural.bridge;

/**
 * @author zhang
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public Implementor getImplementor() {
        return implementor;
    }

    /**
     * 抽象化方法
     */
    abstract void operation();
}
