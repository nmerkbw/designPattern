package com.jxs.adapterObjectExample;

/**
 * Created by jiangxs on 2018/5/9.
 */
public class Client {

    public static void main(String[] args) {

        Player b = new Forwards("巴蒂尔");
        b.attack();

        Player m = new Guards("麦克格雷迪");
        m.attack();

        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();

    }
}
