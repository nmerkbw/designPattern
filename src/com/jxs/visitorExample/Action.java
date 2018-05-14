package com.jxs.visitorExample;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * Action类
 * 相当于Visitor类
 * 为该对象结构中的ConcreteElement的每一个类声明一个Vistor操作
 */
public abstract class Action {

    // 得到男人结论或反映
    public abstract void getManConclusion(Man conElementA);

    //得到女人结论或反映
    public abstract void getWomanConclusion(Woman conElementB);
}
