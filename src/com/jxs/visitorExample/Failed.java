package com.jxs.visitorExample;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * Failed类
 * 相当于ConcreteVisitor类
 * 具体访问者，实现每个由Vistor声明的操作。每个操作实现算法的一部分，而该算法片段乃是对应于结构中对象的类
 */
public class Failed extends Action {

    @Override
    public void getManConclusion(Man conElementA) {

        System.out.println(conElementA.getClass().getSimpleName() + " "
                + this.getClass().getSimpleName() + "时，" + "闷头喝酒，谁都不用劝");
    }

    @Override
    public void getWomanConclusion(Woman conElementB) {

        System.out.println(conElementB.getClass().getSimpleName() + " "
                + this.getClass().getSimpleName() + "时，" + "眼泪汪汪，谁都劝不了");
    }
}
