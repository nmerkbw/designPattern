package com.jxs.observer;

/**
 * Created by jiangxs on 2018/5/8.
 */
public class Client {

    public static void main(String[] args) {

        Boss boss = new Boss();
        StockObserver stockObserver = new StockObserver();
        NBAObserver nbaObserver = new NBAObserver();

        boss.attach(stockObserver);
        boss.attach(nbaObserver);

        boss.notifyAllObserver("老板我回来了");
    }


}
