package com.jxs.strategyExample;

/**
 * Created by jiangxs on 2018/5/2.
 *
 * 上下文
 */
public class CashContext {

    private CashSuper cashSuper;

    // 初始化传入具体的策略
    public CashContext(String type) {

        switch (type) {

            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn(300, 100);
                break;
            case "打8折":
                cashSuper = new CashRebate(0.8);
                break;
            default:
                break;
        }
    }

    // 获取付款金额
    // 根据具体的策略对象，调用其算法的方法
    public double getResult(double money) {

        return cashSuper.acceptCash(money);
    }
}
