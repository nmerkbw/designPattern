package com.jxs.mediator;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * ConcreteColleague2类
 * 具体同事类
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {

        super(mediator);
    }

    public void send(String message) {

        getMediator().send(message, this);
    }

    public void notifyBy(String message) {

        System.out.println("同事2得到通知：" + message);
    }
}
