package com.jxs.simpleFactory;

/**
 * Created by jiangxs on 2018/5/2.
 */
public class OperationFactory {

    public static Operation createOperation(char operator) {

        Operation operation = null;
        switch (operator) {

            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
            case '*':
                operation = new OperationMul();
                break;
            case '/':
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("传入的运算符不支持！");
        }
        return operation;
    }
}
