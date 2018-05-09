package com.jxs.observer;

/**
 * Created by jiangxs on 2018/5/8.
 *
 * 观察者接口
 */
public interface Observer {

    /**
     * 观察者根据具体情况进行相应的应对措施
     * @param subject
     * @param info
     * */
    void update(Subject subject, Object info);
}
