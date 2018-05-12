package com.jxs.iterator;

/**
 * Created by jiangxs on 2018/5/10.
 * <p>
 * 迭代器接口
 */
public interface Iterator<T> {

    T first();

    T next();

    boolean hasNext();

    T currentItem();
}
