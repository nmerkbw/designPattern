package com.jxs.Memento;

/**
 * Created by jiangxs on 2018/5/10.
 */
public class Client {

    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("Off");
        originator.show();

        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
