package com.jxs.interpreterExample;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * Context类
 * 环境角色
 * 这个角色的任务一般是用来存放文法中各个终结符所对应的具体值，
 * 比如R=R1+R2，我们给R1赋值100，给R2赋值200。这些信息需要存放到环境角色中。
 * 多数情况下使用map容器充当环境角色
 */
public class Context {

    private Map<Variable, Integer> map = new HashMap<>();

    public void put(Variable key, int value) {

        map.put(key, value);
    }

    public int getValue(Variable key) {

        Integer value = map.get(key);
        if (value == null) {
            throw new RuntimeException("未查找到对应的值！");
        }
        return value.intValue();
    }
}
