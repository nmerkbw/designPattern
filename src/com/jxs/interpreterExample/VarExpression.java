package com.jxs.interpreterExample;

/**
 * Created by jiangxs on 2018/5/14.
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {

        this.key = key;
    }

    @Override
    public int interpreter(Context context) {

        return context.getValue(key);
    }
}
