package com.jxs.visitorExample;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jiangxs on 2018/5/14.
 *
 * ObjectStructure类
 * 由于总是需要"男人"和"女人"在不同状态的对比，所以我们需要一个对象结构类针对不同的"状态"
 * 遍历"男人"和"女人"，得到不同的反应
 */
public class ObjectStructure {

    private List<Person> elements = new LinkedList<>();

    // 增加
    public void attach(Person element) {

        elements.add(element);
    }

    // 移除
    public void detach(Person element) {

        elements.remove(element);
    }

    // 查看显示
    public void display(Action vistor) {

        for (Person p : elements) {
            p.accept(vistor);
        }
    }
}
