package com.jxs.facade;

/**
 * Created by jiangxs on 2018/5/7.
 */
public class Fund {

    Stock1 s1;
    Stock2 s2;
    NationalDebt1 n1;
    Realty1 r1;

    public Fund() {

        s1 = new Stock1();
        s2 = new Stock2();
        n1 = new NationalDebt1();
        r1 = new Realty1();
    }

    public void buyFund() {

        s1.buy();
        s2.buy();
        n1.buy();
        r1.buy();
    }

    public void sellFund() {

        s1.sell();
        s2.sell();
        n1.sell();
        r1.sell();
    }
}
