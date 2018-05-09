package com.jxs.adapterExample;

/**
 * Created by jiangxs on 2018/5/9.
 */
public class Translator extends Player {

    private ForeignCenter ym = new ForeignCenter();

    public Translator(String name) {

        super(name);
    }

    @Override
    public void attack() {

        ym.jinGong();
    }

    @Override
    public void defense() {

        ym.fangShou();
    }
}
