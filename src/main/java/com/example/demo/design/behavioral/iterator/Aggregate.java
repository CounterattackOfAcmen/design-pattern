package com.example.demo.design.behavioral.iterator;

public interface Aggregate {

    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}
