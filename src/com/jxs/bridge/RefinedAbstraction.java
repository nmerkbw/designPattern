package com.jxs.bridge;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * 被提炼的抽象
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {

        getImplementor().operation();
    }
}
