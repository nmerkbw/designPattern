package com.jxs.mediator;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * Colleague类
 * 抽象同事类
 */
public abstract class Colleague {

    private Mediator mediator;

    // 构造方法，得到中介对象
    public Colleague(Mediator mediator) {

        this.mediator = mediator;
    }

    public Mediator getMediator() {

        return mediator;
    }

    public void setMediator(Mediator mediator) {

        this.mediator = mediator;
    }
}
