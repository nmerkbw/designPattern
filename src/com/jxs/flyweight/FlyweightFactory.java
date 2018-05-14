package com.jxs.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * FlyweightFactory类
 * 享元工厂，用来创建并管理Flyweight对象。
 * 它主要用来确保合理地共享Flyweight，当用户请求一个Flyweight时，FlyweightFactory对象
 * 提供一个已创建的实例或者创建一个（如果不存在的话）
 */
public class FlyweightFactory {

    private Map<String, ConcreteFlyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {

        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {

        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight());
        }
        return flyweights.get(key);
    }
}
