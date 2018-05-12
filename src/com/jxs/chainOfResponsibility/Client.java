package com.jxs.chainOfResponsibility;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * 客户端
 * 向链上的具体处理者对象提交请求
 */
public class Client {

    public static void main(String[] args) {

        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        // 设置职责链上家与下家
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        int[] requests = new int[]{2, 5, 14, 22, 18, 3, 27, 20};

        for (int request : requests) {
            handler1.handleRequest(request);
        }
    }
}
