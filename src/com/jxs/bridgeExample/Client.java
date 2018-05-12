package com.jxs.bridgeExample;

/**
 * Created by jiangxs on 2018/5/12.
 */
public class Client {

    public static void main(String[] args) {

        HandsetBrand hb = new HandsetBrandM();
        hb.setHandsetSoft(new HandsetGame());
        hb.run();

        hb.setHandsetSoft(new HandsetAddress());
        hb.run();

        hb = new HandsetBrandN();
        hb.setHandsetSoft(new HandsetGame());
        hb.run();

        hb.setHandsetSoft(new HandsetAddress());
        hb.run();
    }

}
