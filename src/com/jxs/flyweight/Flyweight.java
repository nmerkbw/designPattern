package com.jxs.flyweight;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * Flyweight类
 * 它是所有具体享元类的超类或接口，通过这个接口，Flyweight可以接受并作用于外部状态
 */
public abstract class Flyweight {

    public abstract void operation(int extrinsicstate);
}
