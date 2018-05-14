package com.jxs.interpreterExample;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * Constant类
 * 常量类
 * 终结符表达式
 */
public class Constant extends Expression {

    private int value;

    public Constant(int value) {

        this.value = value;
    }

    @Override
    public int interpreter(Context context) {

        return value;
    }

    @Override
    public String toString() {

        return new Integer(value).toString();
    }
}
