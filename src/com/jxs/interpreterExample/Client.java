package com.jxs.interpreterExample;

/**
 * Created by jiangxs on 2018/5/14.
 */
public class Client {

    public static void main(String[] args) {

        Context context = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constant a = new Constant(4);

        context.put(x, 2);
        context.put(y, 3);

        Expression expression = new AddExpression(new SubExpression(a, x), new SubExpression(y, x));
        System.out.println(expression.toString() + "=" + expression.interpreter(context));
    }
}
