package com.jxs.vistor;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * ConcreteElementA类
 * 具体元素类，实现accept操作
 */
public class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor vistor) {

        vistor.visitConcreteElementA(this);
    }

    public void operationB() {}
}
