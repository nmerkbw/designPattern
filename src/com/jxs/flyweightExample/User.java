package com.jxs.flyweightExample;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * 用户类
 * 用于网站的客户账号，是“网站”的外部状态
 */
public class User {

    // 用户名
    private String name;

    public User(String name) {

        this.name = name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
