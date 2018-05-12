package com.jxs.bridgeExample;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * 手机品牌抽象类，想当与Abstract类
 */
public abstract class HandsetBrand {

    private HandsetSoft handsetSoft;

    public HandsetSoft getHandsetSoft() {

        return handsetSoft;
    }

    public void setHandsetSoft(HandsetSoft handsetSoft) {

        this.handsetSoft = handsetSoft;
    }

    public abstract void run();
}
