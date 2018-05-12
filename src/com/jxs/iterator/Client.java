package com.jxs.iterator;

/**
 * Created by jiangxs on 2018/5/12.
 */
public class Client {

    public static void main(String[] args) {

        ConcreteAggregate passenger = new ConcreteAggregate();

        passenger.setItems("大鸟");
        passenger.setItems("小菜");
        passenger.setItems("行李");
        passenger.setItems("老外");
        passenger.setItems("公交内部员工");
        passenger.setItems("小偷");

        Iterator<String> iterator = new ConcreteIteratorDesc<>(passenger);
        // Iterator<String> iterator = new ConcreteIteratorDesc<>(passenger);
        System.out.println(iterator.first());
        while (iterator.hasNext()) {
            System.out.println(iterator.currentItem() + "请买车票！");
            iterator.next();
        }
    }
}
