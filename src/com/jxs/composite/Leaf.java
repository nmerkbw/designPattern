package com.jxs.composite;

/**
 * Created by jiangxs on 2018/5/10.
 * <p>
 * 叶节点
 */
public class Leaf extends Component {

    public Leaf(String name) {

        super(name);
    }

    @Override
    public void add(Component component) {

        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {

        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {

        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(getName());
    }
}
