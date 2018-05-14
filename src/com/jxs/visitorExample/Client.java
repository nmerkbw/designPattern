package com.jxs.visitorExample;

/**
 * Created by jiangxs on 2018/5/14.
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        // 在对象结构中加入要对比的“男人”和“女人”
        structure.attach(new Man());
        structure.attach(new Woman());

        //成功时的反应
        Success success = new Success();
        structure.display(success);

        // 失败时的反应
        Failed failed = new Failed();
        structure.display(failed);
    }
}
