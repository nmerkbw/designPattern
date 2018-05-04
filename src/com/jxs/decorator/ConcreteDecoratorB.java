package com.jxs.decorator;

/**
 * Created by jiangxs on 2018/5/3.
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        // 首先运行原Component的operation()
        // 再执行本类的功能，如AddedBehavior()，相当于对原Component进行了装饰
        super.operation();
        AddedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    // 本类特有的方法，以区分ConcreteDecoratorA
    private void AddedBehavior() {

        System.out.println("AddedBehavior Operation");
    }
}
