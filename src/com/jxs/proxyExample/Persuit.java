package com.jxs.proxyExample;

/**
 * Created by jiangxs on 2018/5/3.
 *
 * 相当于代理模式中的RealSubject
 */
public class Persuit implements GiveGift {

    private SchoolGirl mm;

    public Persuit() {}

    public Persuit(SchoolGirl mm) {

        this.mm = mm;
    }

    @Override
    public void giveDolls() {

        System.out.println("送"+mm.getName()+"洋娃娃");
    }

    @Override
    public void giveFlowers() {

        System.out.println("送"+mm.getName()+"鲜花");
    }

    @Override
    public void giveChocolate() {

        System.out.println("送"+mm.getName()+"巧克力");
    }
}
