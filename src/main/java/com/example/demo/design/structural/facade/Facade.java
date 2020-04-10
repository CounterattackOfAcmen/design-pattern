package com.example.demo.design.structural.facade;

/**
 * @author zhang
 */
public class Facade {

    private SubSystemA subSystemA = new SubSystemA();

    private SubSystemB subSystemB = new SubSystemB();

    private SubSystemC subSystemC = new SubSystemC();

    public void method() {
        subSystemA.method1();
        subSystemB.method2();
        subSystemC.method3();
    }

}
