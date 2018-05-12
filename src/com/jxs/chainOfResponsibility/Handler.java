package com.jxs.chainOfResponsibility;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * Handler类
 * 定义一个处理请示的接口
 */
public abstract class Handler {

    private Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    // 设置继任者
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    // 处理请求的抽象方法
    public abstract void handleRequest(int request);
}
