package com.jxs.interpreterExample;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * Expression类
 * 抽象表达式，声明一个抽象的解释操作
 */
public abstract class Expression {

    public abstract int interpreter(Context context);

    public abstract String toString();
}
