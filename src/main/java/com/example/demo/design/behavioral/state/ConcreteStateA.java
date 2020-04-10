package com.example.demo.design.behavioral.state;

public class ConcreteStateA extends AbstractState {
    @Override
    void handle(Context context) {
        System.out.println("状态A处理逻辑。");
        context.setState(new ConcreteStateB());
    }
}
