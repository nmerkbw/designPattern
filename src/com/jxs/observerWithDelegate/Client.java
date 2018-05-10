package com.jxs.observerWithDelegate;

/**
 * Created by jiangxs on 2018/5/8.
 *
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        // 创建一个前台MM去放哨
        Secretary secretary = new Secretary();
        // 创建一个在工作时间炒股的员工
        StockListener stockListener = new StockListener();
        // 创建一个在工作时间看球的员工
        NBAListener nbaListener = new NBAListener();

        // 炒股的员工让前台帮他看着，老板来了记得提醒他
        secretary.addListener(stockListener, "stopTradeStock");

        // 看NBA的员工让前台帮他看着，老板来了记得提醒他
        secretary.addListener(nbaListener, "stopWatchNBA");

        // 看球员工和炒股员工开始愉快的玩耍
        stockListener.tradingStock();
        nbaListener.watchingNBA();

        // 他们愉快的玩了一会以后老板回来了
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 前台通知所有人
        secretary.notifyAllObserver();
    }

}
