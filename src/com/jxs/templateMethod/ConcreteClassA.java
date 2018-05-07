package com.jxs.templateMethod;

/**
 * Created by jiangxs on 2018/5/7.
 */
public class ConcreteClassA extends AbstractClass {

    @Override
    public void primitiveOperation1() {

        System.out.println("具体类A方法1实现");
    }

    @Override
    public void primitiveOperation2() {

        System.out.println("具体类A方法2实现");
    }
}
