package com.jxs.flyweight;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        int extrinsicstate = 22;

        FlyweightFactory f = new FlyweightFactory();
        Flyweight fx = f.getFlyweight("X");
        fx.operation(--extrinsicstate);

        Flyweight fy = f.getFlyweight("Y");
        fy.operation(--extrinsicstate);

        Flyweight fz = f.getFlyweight("Z");
        fz.operation(--extrinsicstate);

        Flyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicstate);
    }
}
