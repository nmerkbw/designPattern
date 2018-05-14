package com.jxs.visitorExample;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * Woman类
 * 相当于ConcreteElementA类
 * 具体元素类，实现accept操作
 */
public class Woman extends Person {

    @Override
    public void accept(Action visitor) {

        visitor.getWomanConclusion(this);
    }
}
