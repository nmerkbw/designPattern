package com.jxs.commandExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * Waiter类
 * 相当于Invoke类
 * 调用者角色，接收到命令，并执行命令
 * 要求该命令执行这个请求
 */
public class Waiter {

    private Command command;
    private List<Command> orders = new ArrayList<>();

    // 设置订单
    public void setOrder(Command command) {
        if (command.toString().contains("BakeChickenWingCommand")) {
            System.out.println("服务员：烤鸡翅没有了，请点别的烧烤!");
        } else {
            orders.add(command);
            System.out.println("增加订单：烤羊肉串 "+"时间："+new Date());
        }
    }

    public void cancelOrder(Command command) {

        orders.remove(command);
        System.out.println("取消订单 "+"时间："+new Date());
    }

    // 通知执行
    public void notifyCommand() {

        for (Command command : orders) {
            command.executeCommand();
        }
    }
}
