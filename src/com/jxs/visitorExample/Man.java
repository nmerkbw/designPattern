package com.jxs.visitorExample;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * Man类
 * 相当于ConcreteElementB类
 * 具体元素类，实现accept操作
 */
public class Man extends Person {

    @Override
    public void accept(Action visitor) {

        visitor.getManConclusion(this);
    }
}
