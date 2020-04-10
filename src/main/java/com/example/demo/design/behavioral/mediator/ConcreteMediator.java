package com.example.demo.design.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends AbstractMediator {

    List<AbstractColleague> colleagues = new ArrayList<>();

    @Override
    public void register(AbstractColleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(AbstractColleague colleague) {
        for (AbstractColleague abstractColleague : colleagues) {
            if (!abstractColleague.equals(colleague)) {
                abstractColleague.receive();
            }
        }
    }
}
