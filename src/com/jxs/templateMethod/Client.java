package com.jxs.templateMethod;

/**
 * Created by jiangxs on 2018/5/7.
 */
public class Client {

    public static void main(String[] args) {

        AbstractClass c;

        c = new ConcreteClassA();
        c.templateMethod();

        c = new ConcreteClassB();
        c.templateMethod();
    }
}
