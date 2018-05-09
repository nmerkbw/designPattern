package com.jxs.observer;

/**
 * Created by jiangxs on 2018/5/8.
 *
 * 通知者接口
 */
public interface Subject {

    /**
     * 添加观察者
     * @param observer
     * */
    void attach(Observer observer);

    /**
     * 移除观察者
     * @param observer
     * */
    void detach(Observer observer);

    /**
     * 通知某个观察者
     * @param observer
     * @param info
     * */
    void notifyObserver(Observer observer,Object info);

    /**
     * 通知所有观察者
     * @param info
     */
    void notifyAllObserver(Object info);
}
