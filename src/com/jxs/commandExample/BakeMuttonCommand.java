package com.jxs.commandExample;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * BakeMuttonCommand类
 * ConcreteCommand类，具体命令类
 * 具体的命令，将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现Excute
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer barbecuer) {

        super(barbecuer);
    }

    @Override
    public void executeCommand() {

        getBarbecuer().bakeMutton();
    }
}
