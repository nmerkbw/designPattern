package com.jxs.interpreter;

/**
 * Created by jiangxs on 2018/5/12.
 */
public class NonterminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {

        System.out.println("非终端解释器");
    }
}
