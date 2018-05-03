package com.jxs.prototype;

/**
 * Created by jiangxs on 2018/5/3.
 *
 * 如果字段是值类型的，则对该字段执行逐位复制
 * 如果字段是引用类型，则复制引用但不复制引用的对象，此时原始对象与其副本引用同一对象
 */
public class PrototypeClient {

    public static void main(String[] args) throws CloneNotSupportedException {

        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", 29);
        a.setWorkExperience("2016-2017", "Baidu");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("2017-2018", "Tencent");

        Resume c = (Resume) a.clone();
        c.setPersonalInfo("男", 22);

        a.display();
        b.display();
        c.display();
    }
}
