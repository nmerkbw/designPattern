package com.jxs.composite;

/**
 * Created by jiangxs on 2018/5/10.
 *
 * 组合中对象声明抽象类
 */
public abstract class Component {

    private String name;

    public Component(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);

}
