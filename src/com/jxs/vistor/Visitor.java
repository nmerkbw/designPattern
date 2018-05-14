package com.jxs.vistor;

/**
 * Created by jiangxs on 2018/5/14.
 * <p>
 * Vistor类
 * 为该对象结构中的ConcreteElement的每一个类声明一个Vistor操作
 */
public abstract class Visitor {

    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
