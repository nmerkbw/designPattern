package com.jxs.bridgeExample;

/**
 * Created by jiangxs on 2018/5/12.
 */
public class HandsetBrandN extends HandsetBrand {

    @Override
    public void run() {

        System.out.print("N牌手机");
        getHandsetSoft().run();
    }
}
