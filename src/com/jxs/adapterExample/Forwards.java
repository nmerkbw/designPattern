package com.jxs.adapterExample;

/**
 * Created by jiangxs on 2018/5/9.
 */
public class Forwards extends Player {

    public Forwards(String name) {

        super(name);
    }

    @Override
    public void attack() {

        System.out.println("前锋进攻！");
    }

    @Override
    public void defense() {

        System.out.println("前锋进攻！");
    }
}
