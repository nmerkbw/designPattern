package com.jxs.observer;

/**
 * Created by jiangxs on 2018/5/8.
 */
public class NBAObserver implements Observer {

    @Override
    public void update(Subject subject, Object info) {

        System.out.println(this.getClass().getSimpleName()
                +","+info+","
                +"赶紧关闭NBA直播视频！");
    }
}
