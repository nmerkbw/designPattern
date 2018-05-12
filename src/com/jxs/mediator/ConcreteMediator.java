package com.jxs.mediator;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * ConcreteMediator类
 * 具体中介者类
 */
public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {

        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {

        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {

        if (colleague == concreteColleague1) {
            concreteColleague2.notifyBy(message);
        } else {
            concreteColleague1.notifyBy(message);
        }
    }
}
