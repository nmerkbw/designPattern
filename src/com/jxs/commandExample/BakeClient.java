package com.jxs.commandExample;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * 客户点单端
 * 客户点单，服务员接单，并给烤肉师傅烤肉
 */
public class BakeClient {

    public static void main(String[] args) {

        // 开店前的准备
        Barbecuer barbecuer = new Barbecuer();
        Command bakeMuttonCommand = new BakeMuttonCommand(barbecuer);
        Command bakeChickWingCommand = new BakeChickenWingCommand(barbecuer);

        // 开门营业
        Waiter girl = new Waiter();
        girl.setOrder(bakeMuttonCommand);
        girl.setOrder(bakeChickWingCommand);
        girl.notifyCommand();
    }
}
