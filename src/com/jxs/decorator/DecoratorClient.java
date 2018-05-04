package com.jxs.decorator;

/**
 * Created by jiangxs on 2018/5/3.
 */
public class DecoratorClient {

    public static void main(String[] args) {

        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();

        // 装饰的方法是：
        // 首先用ConcreteComponent实例化对象concreteComponent
        // 然后用ConcreteecoratorA的实例化对象decoratorA来包装concreteComponent
        // 再用ConcreteDecoratorB的对象decoratorB包装decoratorA，最终执行Operation
        decoratorA.setComponent(concreteComponent);
        decoratorB.setComponent(decoratorA);
        decoratorB.operation();
    }
}
