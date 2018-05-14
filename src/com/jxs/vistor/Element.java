package com.jxs.vistor;

/**
 * Created by jiangxs on 2018/5/14.
 * <p>
 * Element类
 * 定义一个accept操作，它以一个访问者为参数
 */
public abstract class Element {

    public abstract void accept(Visitor vistor);
}
