package com.jxs.factory;

/**
 * Created by jiangxs on 2018/5/3.
 */
public class FactoryClient {

    public static void main(String[] args) {

        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.sweep();
        student.wash();
        student.buyRice();
    }
}
