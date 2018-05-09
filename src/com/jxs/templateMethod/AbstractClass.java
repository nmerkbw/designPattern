package com.jxs.templateMethod;

/**
 * Created by jiangxs on 2018/5/7.
 */
public abstract class AbstractClass {

    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    // 模板方法，给出了逻辑的骨架
    // 而逻辑的组成是一些相应的抽象操作，他们都推迟到子类实现
    public void templateMethod() {

        primitiveOperation1();
        primitiveOperation2();
        System.out.println("");
    }
}
