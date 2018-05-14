package com.jxs.interpreterExample;

/**
 * Created by jiangxs on 2018/5/14.
 */
public class Client {

    public static void main(String[] args) {

        Context context = new Context();
        String x = "x";
        String y = "y";
        String z = "z";

        context.put(x, 2);
        context.put(y, 3);
        context.put(z, 4);

        Expression expression = new AddExpression
    }
}
