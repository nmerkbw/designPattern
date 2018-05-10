package com.jxs.observerWithDelegate;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/5/8.
 * <p>
 * EventHandler类，Event类的载体，提供一个执行Event的所有方法的类
 */
public class EventHandler {

    // 使用List集合来装载事件
    private List<Event> events;

    // 在构造器中初始化List
    public EventHandler() {

        events = new ArrayList<>();
    }

    /**
     * 添加某个对象要执行的事件和所需要的参数
     * @param object
     * @param methodname
     * @param args
     */
    public void addEvent(Object object, String methodname, Object... args) {

        events.add(new Event(object, methodname, args));
    }

    /**
     * 通知所有对象执行指定的事件
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public void notifyAllObserver() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        for (Event event : events) {
            event.invoke();
        }
    }
}
