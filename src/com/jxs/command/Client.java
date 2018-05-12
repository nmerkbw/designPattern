package com.jxs.command;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * 客户端
 * 创建一个具体的命令，并设定它的接收者
 */
public class Client {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.excuteAction();
    }
}
