package com.jxs.proxy;

/**
 * Created by jiangxs on 2018/5/3.
 *
 * Proxy类，保存一个引用，使得代理可以访问实体
 */
public class Proxy extends Subject {

    RealSubject realSubject;

    @Override
    public void request() {

        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
