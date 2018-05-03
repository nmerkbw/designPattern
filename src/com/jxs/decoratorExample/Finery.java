package com.jxs.decoratorExample;

/**
 * Created by jiangxs on 2018/5/3.
 *
 * 服饰类(Decorator)
 */
public class Finery extends Person {

    protected Person component;

    // 打扮
    public void decorate(Person component) {

        this.component = component;
    }

    @Override
    public void show() {

        if (component != null) {
            component.show();
        }
    }
}
