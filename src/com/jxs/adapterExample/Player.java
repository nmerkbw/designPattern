package com.jxs.adapterExample;

/**
 * Created by jiangxs on 2018/5/9.
 * <p>
 * 球员类，抽取球员的都有的方法
 */
public abstract class Player {

    private String name;

    public Player(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
