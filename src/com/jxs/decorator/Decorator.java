package com.jxs.decorator;

/**
 * Created by jiangxs on 2018/5/3.
 */
public class Decorator extends Component {

    protected Component component;

    public void setComponent(Component component) {

        this.component = component;
    }

    @Override
    public void operation() {

        if (component != null) {
            component.operation();
        }
    }
}
