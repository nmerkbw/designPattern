package com.jxs.singleton;

/**
 * Created by jiangxs on 2018/5/12.
 *
 * 单例模式之饿汉式（最开始就创建实例，因为太饿了）
 */
public class EagerInitialization {

    private People people = new People();

    public People getPeople() {

        return people;
    }
}
