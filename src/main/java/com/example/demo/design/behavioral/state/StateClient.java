package com.example.demo.design.behavioral.state;

public class StateClient {

    public static void main(String[] args) {
        Context context=new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
