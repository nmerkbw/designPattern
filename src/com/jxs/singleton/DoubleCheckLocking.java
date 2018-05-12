package com.jxs.singleton;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * 单例模式之DCL（双重检查加锁）
 * 保证在多线程环境下懒汉式的安全性，同时提升效率
 */
public class DoubleCheckLocking {

    private People people;

    public People getPeople() {

        if (people == null) {

            synchronized (DoubleCheckLocking.class) {
                if (people == null) {
                    people = new People();
                }
            }
        }
        return people;
    }
}
