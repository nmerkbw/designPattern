package com.jxs.observerWithDelegate;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by jiangxs on 2018/5/8.
 * <p>
 * 通知者类Secretary类，Boss进来前通知所有人
 */
public class Secretary extends Notifier {

    @Override
    public void addListener(Object object, String methodName, Object... args) {

        System.out.println("有新的员工委托前台放哨了");
        // 使用工厂类获得EventHandler对象，然后调用该对象的方法
        this.getEventHandler().addEvent(object,methodName,args);
    }

    @Override
    public void notifyAllObserver() {

        System.out.println("老板回来了，要准备进去了！");
        try {
            this.getEventHandler().notifyAllObserver();
        }  catch (NoSuchMethodException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }
}
