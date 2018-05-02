package com.jxs.simpleFactory;

/**
 * Created by jiangxs on 2018/5/2.
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {

        return getNumberA() * getNumberB();
    }
}
