package com.jxs.observerWithDelegate;

import java.util.Date;

/**
 * Created by jiangxs on 2018/5/8.
 *
 * 在上班时间炒股的员工
 */
public class StockListener {

    public void tradingStock() {

        System.out.println("炒股员工正在炒股"+new Date());
    }

    public void stopTradeStock() {

        System.out.println("老板来了，关闭炒股软件"+new Date());
    }
}
