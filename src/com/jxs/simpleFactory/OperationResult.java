package com.jxs.simpleFactory;

/**
 * Created by jiangxs on 2018/5/2.
 */
public class OperationResult {

    public static void main(String[] args) {

        Operation operation = null;
        char operator;

        operator = '/';
        double numberA = 10.0;
        double numberB = 20.0;
        operation = OperationFactory.createOperation(operator);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        System.out.println(operation.getResult());
    }
}
