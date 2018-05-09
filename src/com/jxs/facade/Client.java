package com.jxs.facade;

/**
 * Created by jiangxs on 2018/5/7.
 */
public class Client {

    public static void main(String[] args) {

        Fund fund = new Fund();
        // 基金购买
        fund.buyFund();
        // 基金赎回
        fund.sellFund();
    }

}
