package com.jxs.decoratorExample;

/**
 * Created by jiangxs on 2018/5/3.
 */
public class Person {

    private String name;

    public Person() {}

    public Person(String name) {

        this.name = name;
    }

    public void show() {

        System.out.println("装扮："+name);
    }

}
