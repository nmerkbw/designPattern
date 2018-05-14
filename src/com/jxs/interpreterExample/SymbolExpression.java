package com.jxs.interpreterExample;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * 抽象符号解析器
 */
public abstract class SymbolExpression extends Expression {

    private Expression left;
    private Expression right;

    public SymbolExpression(Expression left, Expression right) {

        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {

        return left;
    }

    public Expression getRight() {

        return right;
    }
}
