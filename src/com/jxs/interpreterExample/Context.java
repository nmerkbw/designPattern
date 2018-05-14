package com.jxs.interpreterExample;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiangxs on 2018/5/14.
 */
public class Context {

    private Map<String, Integer> map = new HashMap<>();

    public void put(String key, int value) {

        map.put(key, value);
    }

    public int getValue(String key) {

        Integer value = map.get(key);
        if (value == null) {
            throw new RuntimeException("未查找到对应的值！");
        }
        return value.intValue();
    }
}
