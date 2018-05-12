package com.jxs.commandExample;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * Command类
 * 命令角色，需要执行的所有命令都在这里声明
 * 用来声明执行操作的接口
 */
public abstract class Command {

    private Barbecuer barbecuer;

    public Barbecuer getBarbecuer() {

        return barbecuer;
    }

    public void setBarbecuer(Barbecuer barbecuer) {

        this.barbecuer = barbecuer;
    }

    public Command(Barbecuer barbecuer) {

        this.barbecuer = barbecuer;
    }

    public abstract void executeCommand();
}
