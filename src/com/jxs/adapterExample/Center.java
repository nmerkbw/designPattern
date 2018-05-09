package com.jxs.adapterExample;

/**
 * Created by jiangxs on 2018/5/9.
 */
public class Center extends Player {

    public Center(String name) {

        super(name);
    }

    @Override
    public void attack() {

        System.out.println("中锋进攻！");
    }

    @Override
    public void defense() {

        System.out.println("中锋防守");
    }
}
