package com.jxs.simpleFactory;

/**
 * Created by jiangxs on 2018/5/2.
 */
public abstract class Operation {

    private double numberA = 0.0;
    private double numberB = 0.0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();
}
