package com.jxs.flyweightExample;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * ConcreteWebsite类
 * 具体网站类
 */
public class ConcreteWebsite extends Website {

    private String name;

    public ConcreteWebsite(String name) {

        this.name = name;
    }

    @Override
    public void use(User user) {

        System.out.println("网站分类：" + name + " 用户：" + user.getName());
    }
}
