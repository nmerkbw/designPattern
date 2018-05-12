package com.jxs.command;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * Command类
 * 命令角色，需要执行的所有命令都在这里声明
 * 用来声明执行操作的接口
 */
public abstract class Command {

    private Receiver receiver;

    public Command(Receiver receiver) {

        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
