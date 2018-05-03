package com.jxs.proxyExample;

/**
 * Created by jiangxs on 2018/5/3.
 */
public class ProxyPeople implements GiveGift {

    private Persuit gg;

    public ProxyPeople() {}

    public ProxyPeople(SchoolGirl mm) {

        gg = new Persuit(mm);
    }

    @Override
    public void giveDolls() {

        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {

        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {

        gg.giveChocolate();
    }
}
