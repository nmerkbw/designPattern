package com.jxs.compositeExample;

/**
 * Created by jiangxs on 2018/5/10.
 * <p>
 * 人力资源部，树叶节点
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {

        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {

        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(getName());
    }

    @Override
    public void lineOfDuty() {

        System.out.println(getName() + "员工招聘培训管理");
    }
}
