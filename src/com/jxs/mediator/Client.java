package com.jxs.mediator;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        ConcreteMediator mediator = new ConcreteMediator();

        // 让两个具体的同事类认识中介者对象
        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);

        // 让中介者认识各个具体同事类对象
        mediator.setConcreteColleague1(c1);
        mediator.setConcreteColleague2(c2);

        c1.send("去哪？吃啥？");
        c2.send("南门，鸡公煲");
    }
}
