package com.jxs.iterator;

/**
 * Created by jiangxs on 2018/5/10.
 * <p>
 * 具体迭代器
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private ConcreteAggregate<T> concreteAggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate<T> concreteAggregate) {

        this.setConcreteAggregate(concreteAggregate);
    }

    public ConcreteAggregate<T> getConcreteAggregate() {

        return concreteAggregate;
    }

    public void setConcreteAggregate(ConcreteAggregate<T> concreteAggregate) {

        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public T first() {
        return concreteAggregate.getItems(0);
    }

    @Override
    public T next() {

        current++;
        if (current < concreteAggregate.count()) {
            return concreteAggregate.getItems(current);
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {

        return current < concreteAggregate.count() ? true : false;
    }

    @Override
    public T currentItem() {

        return concreteAggregate.getItems(current);
    }
}
