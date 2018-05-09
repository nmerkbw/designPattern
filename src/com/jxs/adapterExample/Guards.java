package com.jxs.adapterExample;

/**
 * Created by jiangxs on 2018/5/9.
 */
public class Guards extends Player {

    private String name;
    public Guards(String name) {

        super(name);
        this.name = name;
    }

    @Override
    public void attack() {

        System.out.println("后卫 " + name + " 进攻！");
    }

    @Override
    public void defense() {

        System.out.println("后卫 " + name + " 防守");
    }
}
