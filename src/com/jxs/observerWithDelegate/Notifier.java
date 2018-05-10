package com.jxs.observerWithDelegate;

/**
 * Created by jiangxs on 2018/5/8.
 * <p>
 * 通知者类
 * 前台的秘书和老板都相当于一个通知者，将两者共同点抽取出来成为一个抽象类
 * 他们有功能的方法：
 * ①可能有新的员工开始浪了，增加需要通知的员工
 * ②老板来了需要被通知
 */
public abstract class Notifier {

    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {

        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {

        this.eventHandler = eventHandler;
    }

    /**
     * 需要增加通知者
     * @param object 要添加的观察者
     * @param methodName 观察者中要委托的方法名
     * @param args 观察者中要委托方法的参数（没有参数时可不写）
     */
    public abstract void addListener(Object object, String methodName, Object... args);

    /**
     * 告诉所有人老板来了
     */
    public abstract void notifyAllObserver();
}
