package com.example.demo.design.structural.composite.transparent;

/**
 * @author zhang
 */
public interface Component {

    /**
     * 增加节点
     * @param component 抽象构件
     */
    void add(Component component);

    /**
     * 移除节点
     * @param component 抽象构件
     */
    void remove(Component component);

    /**
     * 获取子节点
     * @param t 节点位置
     * @return 抽象构件
     */
    Component getChild(int t);

    /**
     * 节点操作方法
     */
    void operation();
}
