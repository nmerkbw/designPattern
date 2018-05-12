package com.jxs.command;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * Invoke类
 * 调用者角色，接收到命令，并执行命令
 * 要求该命令执行这个请求
 */
public class Invoker {

    private Command command;

    public Command getCommand() {

        return command;
    }

    public void setCommand(Command command) {

        this.command = command;
    }

    public void excuteAction() {

        command.execute();
    }
}
