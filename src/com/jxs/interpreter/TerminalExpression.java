package com.jxs.interpreter;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * TerminalExpression类（终结符表达式）
 * 实现与文法中的终结符相关联的解释操作。实现抽象表达式中所要求的接口，
 * 主要是一个interpreter()方法。文法中每一个终结符都有一个具体终结表达式与之相对应。
 */
public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {

        System.out.println("终端解释器");
    }
}
