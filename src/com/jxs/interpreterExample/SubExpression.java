package com.jxs.interpreterExample;

/**
 * Created by jiangxs on 2018/5/14.
 */
public class SubExpression extends SymbolExpression {

    private Expression left;
    private Expression right;

    public SubExpression(Expression left, Expression right) {

        super(left, right);
    }

    @Override
    public int interpreter(Context context) {

        return left.interpreter(context) - right.interpreter(context);
    }
}
