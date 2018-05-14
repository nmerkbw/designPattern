package com.jxs.vistor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jiangxs on 2018/5/14.
 * <p>
 * ObjectStructure类
 * 能枚举它的元素，可以提供一个高层的接口以允许访问者访问它的元素
 */
public class ObjectStructure {

    private List<Element> elements = new LinkedList<>();

    public void attach(Element element) {

        elements.add(element);
    }

    public void detach(Element element) {

        elements.remove(element);
    }

    public void accept(Visitor visitor) {

        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
