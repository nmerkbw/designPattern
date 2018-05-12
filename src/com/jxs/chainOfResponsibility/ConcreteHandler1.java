package com.jxs.chainOfResponsibility;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * ConcreteHandler1类
 * 具体处理者类，处理它所负责的请求，可访问它的后继者
 * 如果可处理该请求，就处理之，否则就将该请求转发给它的后继者
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(int request) {

        // 0到10处理该请求
        if (request > 0 && request < 10) {
            System.out.println(this.getClass().getSimpleName() + "处理请求");
        } else if (getSuccessor() != null) {
            // 转移到下一位
            getSuccessor().handleRequest(request);
        }
    }
}
