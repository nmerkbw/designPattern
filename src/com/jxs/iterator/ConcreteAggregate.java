package com.jxs.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/5/10.
 * <p>
 * 具体聚集类，继承Aggregate
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private List<T> items = new ArrayList<>();

    public T getItems(int index) {

        return items.get(index);
    }

    public void setItems(T item) {

        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {

        return new ConcreteIterator<T>(this);
    }

    public int count() {

        return items.size();
    }
}
