package com.jxs.interpreter;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * 客户端
 */
public class InterpreterClient {

    public static void main(String[] args) {

        Context context = new Context();
        List<AbstractExpression> list = new LinkedList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression expression : list) {
            expression.interpret(context);
        }
    }
}
