package com.jxs.proxyExample;

/**
 * Created by jiangxs on 2018/5/3.
 */
public class Client {

    public static void main(String[] args) {

        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("娇娇");

        ProxyPeople daili = new ProxyPeople(jiaojiao);

        daili.giveChocolate();
        daili.giveDolls();
        daili.giveFlowers();
    }
}
