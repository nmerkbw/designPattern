package com.jxs.singleton;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * 单例模式之懒汉式（当要实例化的对象为空时才创建对象，因为太懒）
 */
public class LazyInitialization {

    private People people;

    public People getPeople() {

        if (people == null) {

            people = new People();// 不安全
        }
        return people;
    }
}
