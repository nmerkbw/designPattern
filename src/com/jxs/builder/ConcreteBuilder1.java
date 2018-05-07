package com.jxs.builder;

/**
 * Created by jiangxs on 2018/5/7.
 *
 * @description: 具体建造类1
 */
public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();

    @Override
    public void buildPartA() {

        product.add("部件A");
    }

    @Override
    public void buildPartB() {

        product.add("部件B");
    }

    @Override
    public Product getResult() {

        return product;
    }
}
