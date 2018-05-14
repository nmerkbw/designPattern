package com.jxs.vistor;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * ConcreteElementB类
 * 具体元素类，实现accept操作
 */
public class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor vistor) {

        vistor.visitConcreteElementB(this);
    }

    public void operationB() {}
}
