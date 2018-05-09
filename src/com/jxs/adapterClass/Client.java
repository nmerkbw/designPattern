package com.jxs.adapterClass;

import com.jxs.adapterObject.Adapter;
import com.jxs.adapterObject.Target;

/**
 * Created by jiangxs on 2018/5/9.
 *
 * 客户所期待的接口。目标可以是具体的或抽象的类，也可以是接口
 */
public class Client {

    public static void main(String[] args) {

        Target target = new Adapter();
        target.request();
    }
}
