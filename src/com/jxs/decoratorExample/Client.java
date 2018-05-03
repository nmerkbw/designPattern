package com.jxs.decoratorExample;

/**
 * Created by jiangxs on 2018/5/3.
 */
public class Client {

    public static void main(String[] args) {

        Person xc = new Person("小菜");
        System.out.println("第一种装扮：");

        Sneakers pqx = new Sneakers();
        BigTrousers dkc = new BigTrousers();
        TShirts tx = new TShirts();

        pqx.decorate(xc);
        dkc.decorate(pqx);
        tx.decorate(dkc);
        tx.show();

        System.out.println("\n第二种装扮");
        LeatherShoes px = new LeatherShoes();
        Tie ld = new Tie();
        Suit xz = new Suit();

        px.decorate(xc);
        ld.decorate(px);
        xz.decorate(ld);
        xz.show();
    }
}
