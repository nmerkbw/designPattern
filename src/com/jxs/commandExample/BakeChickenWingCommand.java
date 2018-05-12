package com.jxs.commandExample;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * BakeChickenWingCommand类
 * 相当于ConcreteCommand类，具体命令类
 * 具体的命令，将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现Excute
 */
public class BakeChickenWingCommand extends Command {


    public BakeChickenWingCommand(Barbecuer barbecuer) {

        super(barbecuer);
    }

    @Override
    public void executeCommand() {

        getBarbecuer().bakeChickenWing();
    }
}
