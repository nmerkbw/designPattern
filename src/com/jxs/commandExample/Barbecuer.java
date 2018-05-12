package com.jxs.commandExample;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * Barbecuer类
 * 即相当于Receiver类
 * 接受者角色，干活的角色，命令传递到这里是应该被执行的
 * 知道如何实施与执行一个与请求相关的操作，任何类都可能成为一个接收者
 */
public class Barbecuer {

    public void bakeMutton() {

        System.out.println("烤羊肉串！");
    }

    public void bakeChickenWing() {

        System.out.println("烤鸡翅膀！");
    }
}
