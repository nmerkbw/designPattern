package com.jxs.Memento;

/**
 * Created by jiangxs on 2018/5/10.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {

        this.state = state;
    }

    public Memento createMemento() {

        return new Memento(state);
    }

    public void setMemento(Memento memento) {

        state = memento.getState();
    }

    public void show() {

        System.out.println("State = " + state);
    }
}
