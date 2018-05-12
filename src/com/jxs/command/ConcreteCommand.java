package com.jxs.command;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * ConcreteCommand类
 * 具体的命令，将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现Excute
 */
public class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {

        super(receiver);
    }

    @Override
    public void execute() {

        getReceiver().action();
    }
}
