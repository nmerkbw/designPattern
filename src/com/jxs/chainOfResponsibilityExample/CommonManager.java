package com.jxs.chainOfResponsibilityExample;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * CommonManager类 经理类
 * 相当于ConcreteHandler类
 * 具体处理者类，处理它所负责的请求，可访问它的后继者
 * 如果可处理该请求，就处理之，否则就将该请求转发给总监
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {

        super(name);
    }

    @Override
    public void requestApplications(Request request) {

        if (request.getRequestType().equals("请假")
                && request.getNumber() <= 2) {
            System.out.println(getName() + ":" +request.getRequestContent()
                    + request.getNumber() + "天，被批准");
        } else if (getSuperior() != null) {
            getSuperior().requestApplications(request);
        }
    }
}
