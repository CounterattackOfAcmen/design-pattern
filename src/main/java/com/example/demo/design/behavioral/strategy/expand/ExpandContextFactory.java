package com.example.demo.design.behavioral.strategy.expand;

import com.example.demo.design.behavioral.strategy.IStrategy;

import java.util.HashMap;

/**
 * @author zhang
 */
public class ExpandContextFactory {

    private HashMap<Class<? extends IStrategy>, IStrategy> strategies = new HashMap<> ();

    public void put(Class<? extends IStrategy> key, IStrategy strategy) {
        strategies.put(key, strategy);
    }

    public IStrategy get(Class<? extends IStrategy> key) throws IllegalAccessException, InstantiationException {
        IStrategy strategy = strategies.get(key);
        if (strategy == null) {
            strategy = key.newInstance();
            strategies.put(key, strategy);
        }
        return strategy;
    }

    public void strategyMethod(Class<? extends IStrategy> key) throws InstantiationException, IllegalAccessException {
        get(key).strategyMethod();
    }
}
