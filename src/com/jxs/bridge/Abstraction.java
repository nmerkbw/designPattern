package com.jxs.bridge;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * 抽象类
 */
public abstract class Abstraction {

    private Implementor implementor;

    public void setImplementor(Implementor implementor) {

        this.implementor = implementor;
    }

    public Implementor getImplementor() {

        return implementor;
    }

    public void operation() {

        implementor.operation();

    }
}
