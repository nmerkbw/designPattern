package com.jxs.strategyExample;

/**
 * Created by jiangxs on 2018/5/2.
 *
 * 现金收费接口
 */
public interface CashSuper {

    double acceptCash(double money);
}

/**
 * Created by jiangxs on 2018/5/2.
 *
 * 返利收费子类
 */
class CashReturn implements CashSuper {

    private double moneyCondition = 0d;
    private double moneyReturn = 0d;

    public CashReturn(double moneyCondition, double moneyReturn) {

        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {

        return money - Math.floor(money / moneyCondition) * moneyReturn;
    }
}

/**
 * Created by jiangxs on 2018/5/2.
 *
 * 打折收费子类
 */
class CashRebate implements CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {

        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {

        return money * moneyRebate;
    }
}

/**
 * Created by jiangxs on 2018/5/2.
 *
 * 正常收费子类
 */
class CashNormal implements CashSuper {

    @Override
    public double acceptCash(double money) {

        return money;
    }
}
