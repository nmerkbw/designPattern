package com.jxs.interpreterExample;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * SubExpression类
 * 具体的加法表达式
 * 非终结符表达式
 */
public class SubExpression extends Expression {

    private Expression left;
    private Expression right;

    public SubExpression(Expression left, Expression right) {

        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {

        return left.interpreter(context) - right.interpreter(context);
    }

    @Override
    public String toString() {

        return "(" + left.toString() + "-" + right.toString() + ")";
    }
}
