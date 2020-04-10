package com.example.demo.design.behavioral.state;

public class ConcreteStateB extends AbstractState {
    @Override
    void handle(Context context) {
        System.out.println("状态B处理逻辑。");
        context.setState(new ConcreteStateA());
    }
}
