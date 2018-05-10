package com.jxs.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/5/10.
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {

        super(name);
    }

    @Override
    public void add(Component component) {

        children.add(component);
    }

    @Override
    public void remove(Component component) {

        children.remove(component);
    }

    @Override
    public void display(int depth) {

        // 显示枝节点名称，并对其下级进行遍历
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(getName());
        for (Component component : children) {
            component.display(depth + 2);
        }
    }
}
