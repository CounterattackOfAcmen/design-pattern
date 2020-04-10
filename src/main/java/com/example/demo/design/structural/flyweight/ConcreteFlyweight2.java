package com.example.demo.design.structural.flyweight;

/**
 * @author zhang
 */
public class ConcreteFlyweight2 implements Flyweight {

    private String key;

    public ConcreteFlyweight2(String key) {
        this.key = key;
        System.out.println("具体享元2：" + key + "创建成功。");
    }

    @Override
    public void operation(UnsharedFlyweight state) {
        System.out.println("具体享元2：" + key + "被调用，非享元信息：" + state.getInfo());
    }

    public String getKey() {
        return key;
    }
}
