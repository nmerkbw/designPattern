package com.jxs.strategy;

/**
 * Created by jiangxs on 2018/5/2.
 *
 * 算法策略接口
 */
public interface Strategy {

    void AlgorithmInterface();
}

/**
 * 具体算法A
 */
class ConcreteStrategyA implements Strategy {

    // 算法A的实现方法
    @Override
    public void AlgorithmInterface() {

        System.out.println("算法A实现");
    }
}

/**
 * 具体算法B
 */
class ConcreteStrategyB implements Strategy {

    // 算法B的实现方法
    @Override
    public void AlgorithmInterface() {

        System.out.println("算法B实现");
    }
}

/**
 * 具体算法C
 */
class concreteStrategyC implements Strategy {

    // 算法C的实现方法
    @Override
    public void AlgorithmInterface() {

        System.out.println("算法C实现");
    }
}
