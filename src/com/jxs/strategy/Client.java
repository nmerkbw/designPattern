package com.jxs.strategy;


/**
 * Created by jiangxs on 2018/5/2.
 */
public class Client {

    public static void main(String[] args) {

        Context context;

        // 由于实例化策略不同
        // 所以最终调用context.contextInterface()时所得的结果也不尽相同
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new concreteStrategyC());
        context.contextInterface();
    }
}
