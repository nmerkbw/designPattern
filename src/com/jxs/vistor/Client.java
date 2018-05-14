package com.jxs.vistor;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();
        structure.attach(new ConcreteElementA());
        structure.attach(new ConcreteElementB());

        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();

        structure.accept(visitor1);
        structure.accept(visitor2);
    }
}
