package com.jxs.iterator;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * 具体迭代器
 */
public class ConcreteIteratorDesc<T> implements Iterator<T>{

    private ConcreteAggregate<T> concreteAggregate;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate concreteAggregate) {

        this.setConcreteAggregate(concreteAggregate);
        current = concreteAggregate.count() - 1;
    }

    public ConcreteAggregate<T> getConcreteAggregate() {

        return concreteAggregate;
    }

    public void setConcreteAggregate(ConcreteAggregate<T> concreteAggregate) {

        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public T first() {

        return concreteAggregate.getItems(current);
    }

    @Override
    public T next() {

        current--;
        if (current >= 0) {
            return concreteAggregate.getItems(current);
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return current >= 0 ? true : false;
    }

    @Override
    public T currentItem() {
        return concreteAggregate.getItems(current);
    }
}
