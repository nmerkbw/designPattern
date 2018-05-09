package com.jxs.adapterClassExample;

public class Translator extends ForeignCenter implements Player {

    public Translator(String name) {

        super.setName(name);
    }
    @Override
    public void jinGong() {
        super.jinGong();
    }

    @Override
    public void fangShou() {
        super.fangShou();
    }

    @Override
    public void attack() {

        jinGong();
    }

    @Override
    public void defense() {

        fangShou();
    }
}
