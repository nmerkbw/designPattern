package com.jxs.adapterClassExample;

import com.jxs.adapterObjectExample.Forwards;
import com.jxs.adapterObjectExample.Guards;



public class Client {

    public static void main(String[] args) {

        com.jxs.adapterObjectExample.Player b = new Forwards("巴蒂尔");
        b.attack();

        com.jxs.adapterObjectExample.Player m = new Guards("麦克格雷迪");
        m.attack();

        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();

    }
}
