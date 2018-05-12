package com.jxs.bridge;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * 具体实现类B
 */
public class ImplementB implements Implementor {

    @Override
    public void operation() {

        System.out.println("具体实现B的方法执行");
    }
}
