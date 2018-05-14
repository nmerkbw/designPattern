package com.jxs.interpreterExample;

import java.util.Stack;

/**
 * Created by jiangxs on 2018/5/14.
 */
public class Calculator {

    private Expression expression;

    public Calculator(String expStr) {

        expression = null;

        // 栈，用来暂存中间结果
        Stack<Expression> stackExp;

        Expression left = null;
        Expression right = null;

        char[] expStrArray = expStr.toCharArray();
        // 从左到右分析表达式（a+b-c）
        for (int i = 0; i < expStrArray.length; i++) {
            switch (expStrArray[i]) {
                case '+':
                    // 先从栈中取出左操作数
                    left = stackExp.peek();
            }
        }
    }
}
