package com.jxs.chainOfResponsibilityExample;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * Manager类 管理者
 * 等同于Handler类
 * 定义一个处理请示的接口
 */
public abstract class Manager {

    private String name;
    // 管理者的上级
    private Manager superior;

    public Manager(String name) {

        this.name = name;
    }

    public Manager getSuperior() {

        return superior;
    }

    // 设置管理者的上级
    public void setSuperior(Manager superior) {

        this.superior = superior;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public abstract void requestApplications(Request request);
}
