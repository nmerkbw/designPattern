package com.jxs.adapterExample;

/**
 * Created by jiangxs on 2018/5/9.
 */
public class Guards extends Player {

    public Guards(String name) {

        super(name);
    }

    @Override
    public void attack() {

        System.out.println("后卫进攻！");
    }

    @Override
    public void defense() {

        System.out.println("后卫防守");
    }
}
