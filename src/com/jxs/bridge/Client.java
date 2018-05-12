package com.jxs.bridge;

/**
 * Created by jiangxs on 2018/5/12.
 */
public class Client {

    public static void main(String[] args) {

        RefinedAbstraction ra = new RefinedAbstraction();

        ra.setImplementor(new ImplementorA());
        ra.operation();

        ra.setImplementor(new ImplementB());
        ra.operation();
    }
}
