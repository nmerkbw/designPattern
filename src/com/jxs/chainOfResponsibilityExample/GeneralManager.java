package com.jxs.chainOfResponsibilityExample;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * GeneralManager 总经理类
 * 相当于ConcreteHandler类
 * 具体处理者类，处理它所负责的请求，可访问它的后继者
 * 如果可处理该请求，就处理之，否则就将该请求转发给它的后继
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {

        super(name);
    }

    @Override
    public void requestApplications(Request request) {

        if (request.getRequestType().equals("请假")) {
            if (request.getNumber() < 10) {
                System.out.println(getName() + ":" + request.getRequestContent()
                        + request.getNumber() + "天，被批准");
            } else {
                System.out.println(getName() + ":" + request.getRequestContent()
                        + request.getNumber() + "天，时间太久，不予批准");
            }
        } else if (request.getRequestType().equals("加薪")
                && request.getNumber() <= 1000) {
            System.out.println(getName() + ":" + request.getRequestContent()
                    + request.getNumber() + "元，被批准");
        } else if (request.getRequestType().equals("加薪")
                && request.getNumber() > 1000) {
            System.out.println(getName() + ":" + request.getRequestContent()
                    + request.getNumber() + "元，再考虑考虑");
        }
    }
}
