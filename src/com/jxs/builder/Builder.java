package com.jxs.builder;

/**
 * Created by jiangxs on 2018/5/7.
 *
 * @description: 抽象建造类，确定产品由两个部件PartA和PartB组成，
 * 并声明一个得到产品建造后结果的方法getResult
 */
public abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
