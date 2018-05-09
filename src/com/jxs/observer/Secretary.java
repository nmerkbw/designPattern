package com.jxs.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/5/8.
 */
public class Secretary implements Subject {

    // 同事列表
    private List<Observer> observers = new ArrayList<>();
    private String action;

    // 前台状态
    private String subjectState;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public void attach(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {

        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver(Object info) {

        for (Observer observer : observers) {
            observer.update(this, info);
        }
    }

    @Override
    public void notifyObserver(Observer observer, Object info) {

        observer.update(this, info);
    }
}
