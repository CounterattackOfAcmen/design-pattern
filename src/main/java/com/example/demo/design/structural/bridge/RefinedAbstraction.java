package com.example.demo.design.structural.bridge;

/**
 * @author zhang
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    void operation() {
        System.out.println("扩展抽象化角色。");
        implementor.operational();
    }

}
