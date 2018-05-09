package com.jxs.adapterObjectExample;

/**
 * Created by jiangxs on 2018/5/9.
 */
public class Translator extends Player {

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {

        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {

        foreignCenter.jinGong();
    }

    @Override
    public void defense() {

        foreignCenter.fangShou();
    }
}
