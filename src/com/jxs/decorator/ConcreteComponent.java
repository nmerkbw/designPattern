package com.jxs.decorator;

/**
 * Created by jiangxs on 2018/5/3.
 */
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
