package com.jxs.interpreterExample;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * Variable类
 * 变量类
 * 终结符表达式
 */
public class Variable extends Expression {

    private String name;

    public Variable(String name) {

        this.name = name;
    }
    @Override
    public int interpreter(Context context) {

        return context.getValue(this);
    }

    @Override
    public String toString() {

        return name;
    }
}
