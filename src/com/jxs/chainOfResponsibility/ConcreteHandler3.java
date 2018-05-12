package com.jxs.chainOfResponsibility;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * ConcreteHandler3类
 * 具体处理者类，处理它所负责的请求，可访问它的后继者
 * 如果可处理该请求，就处理之，否则就将该请求转发给它的后继者
 */
public class ConcreteHandler3 extends Handler {

    @Override
    public void handleRequest(int request) {

        if (request >= 20 && request < 30) {
            System.out.println(this.getClass().getSimpleName()+"处理此请求");
        } else if (getSuccessor() != null) {
            getSuccessor().handleRequest(request);
        }
    }
}
