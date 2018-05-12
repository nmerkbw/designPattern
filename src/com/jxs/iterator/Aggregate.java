package com.jxs.iterator;

/**
 * Created by jiangxs on 2018/5/10.
 * <p>
 * 聚集抽象类
 */
public interface Aggregate<T> {

    Iterator<T> createIterator();
}
