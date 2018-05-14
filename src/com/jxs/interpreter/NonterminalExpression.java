package com.jxs.interpreter;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * NonterminalExpression类（非终结符表达式）
 * 为文法中的非终结符实现解操作。
 * 对文法中每一条规则R1、R2 ... Rn都需要一个具体的非终结符表达式类。
 * 通过实现抽象表达式的interpret()方法实现解释操作。
 * 解释操作以递归方式调用上面所提到的代表R1、R2 ... Rn中各个符号的实例变量。
 */
public class NonterminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {

        System.out.println("非终端解释器");
    }
}
