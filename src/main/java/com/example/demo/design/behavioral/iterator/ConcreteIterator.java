package com.example.demo.design.behavioral.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator {

    private List<Object> list;

    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        return this.hasNext() ? list.get(++index) : null;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }
}
