package com.jxs.adapterClass;

/**
 * Created by jiangxs on 2018/5/9.
 *
 * 类适配器，继承Adaptee类和实现Target接口的所有方法并改写
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void specificRequest() {
        super.specificRequest();
    }

    @Override
    public void request() {

        specificRequest();
    }
}
