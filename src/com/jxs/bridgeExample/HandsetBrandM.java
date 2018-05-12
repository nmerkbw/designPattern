package com.jxs.bridgeExample;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * M品牌的手机，具体被提炼的抽象
 */
public class HandsetBrandM extends HandsetBrand {

    @Override
    public void run() {

        System.out.print("M牌手机");
        getHandsetSoft().run();
    }
}
