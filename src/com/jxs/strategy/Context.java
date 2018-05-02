package com.jxs.strategy;

/**
 * Created by jiangxs on 2018/5/2.
 *
 * 上下文
 */
public class Context {

    private Strategy strategy;

    // 初始化时，传入具体的策略对象
    public Context(Strategy strategy) {

        this.strategy = strategy;
    }

    // 上下文接口
    // 根据具体的策略对象，调用其算法的方法
    public void contextInterface() {

        strategy.AlgorithmInterface();
    }
}
