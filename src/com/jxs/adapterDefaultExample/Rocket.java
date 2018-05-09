package com.jxs.adapterDefaultExample;

/**
 * Created by jiangxs on 2018/5/9.
 *
 * Rocket这个抽象类就相当于DefaultAdapter(缺省适配器)
 */
public abstract class Rocket implements Player{

    @Override
    public void smoke() {}

    @Override
    public void drink() {}

    @Override
    public void perm() {}
}
