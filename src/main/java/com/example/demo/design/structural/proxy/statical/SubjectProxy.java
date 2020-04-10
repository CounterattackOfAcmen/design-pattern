package com.example.demo.design.structural.proxy.statical;

public class SubjectProxy implements Subject {

    private RealSubject realSubject;

    public SubjectProxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request(String message) {
        preRequest();
        realSubject.request(message);
        postRequest();
    }

    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }

    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }
}
