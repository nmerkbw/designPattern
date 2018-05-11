package com.jxs.compositeExample;

/**
 * Created by jiangxs on 2018/5/10.
 *
 * 公司类，组合中对象声明抽象类
 */
public abstract class Company {

    private String name;

    public Company(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 增加公司
    public abstract void add(Company company);

    // 移除公司
    public abstract void remove(Company company);

    // 显示
    public abstract void display(int depth);

    // 履行职责
    public abstract void lineOfDuty();
}
