package com.jxs.observerWithDelegate;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by jiangxs on 2018/5/8.
 * <p>
 * 通知者类Boss类，Boss进来视察也相当于充当了通知者
 */
public class Boss extends Notifier {

    @Override
    public void addListener(Object object, String methodName, Object... args) {

        System.out.println("有新的员工要为老板的到来准备");
        // 使用工厂类获得EventHandler对象，然后调用该对象的方法
        this.getEventHandler().addEvent(object,methodName,args);
    }

    @Override
    public void notifyAllObserver() {

        System.out.println("老板走过来了！");
        try {
            this.getEventHandler().notifyAllObserver();
        }  catch (NoSuchMethodException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
