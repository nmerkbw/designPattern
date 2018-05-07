package com.jxs.builder;

/**
 * Created by jiangxs on 2018/5/7.
 *
 * @description: 指挥者类
 */
public class Director {

    public void construct(Builder builder) {

        builder.buildPartA();
        builder.buildPartB();
    }
}
