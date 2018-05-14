package com.jxs.visitorExample;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * Person类
 * 相当于Element类
 * 定义一个accept操作，它以一个访问者（人的反应）为参数
 */
public abstract class Person {

    public abstract void accept(Action visitor);
}
