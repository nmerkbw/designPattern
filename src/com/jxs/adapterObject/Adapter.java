package com.jxs.adapterObject;

/**
 * Created by jiangxs on 2018/5/9.
 *
 * 通过在内部包装一个Adaptee对象，把源接口转换成目标接口
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {

        adaptee.specificRequest();
    }
}
