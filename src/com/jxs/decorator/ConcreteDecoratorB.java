package com.jxs.decorator;

/**
 * Created by jiangxs on 2018/5/3.
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void AddedBehavior() {

        System.out.println("AddedBehavior Operation");
    }
}
