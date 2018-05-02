package com.jxs.strategyExample;

/**
 * Created by jiangxs on 2018/5/2.
 *
 * 客户端
 */
public class CashClient {

    public static void main(String[] args) {

        CashContext cashContext;
        double money;

        money = 800d;
        cashContext = new CashContext("正常收费");
        System.out.println(cashContext.getResult(money));

        cashContext = new CashContext("满300减100");
        System.out.println(cashContext.getResult(money));

        cashContext = new CashContext("打8折");
        System.out.println(cashContext.getResult(money));
    }
}
