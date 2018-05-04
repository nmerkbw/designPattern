package com.jxs.decorator;

/**
 * Created by jiangxs on 2018/5/3.
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void operation() {
        // 首先运行原Component的operation()
        // 在执行本类的功能，如addedState,相当于对原Component进行了装饰
        super.operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
