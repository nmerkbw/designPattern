package com.jxs.compositeExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangxs on 2018/5/10.
 * <p>
 * 具体公司类，实现接口，树枝节点
 */
public class ConcreteCompany extends Company {

    private List<Company> companies = new ArrayList<>();

    public ConcreteCompany(String name) {

        super(name);
    }

    @Override
    public void add(Company company) {

        companies.add(company);
    }

    @Override
    public void remove(Company company) {

        companies.remove(company);
    }

    @Override
    public void display(int depth) {

        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(getName());
        for (Company company : companies) {
            company.display(depth+2);
        }
    }

    @Override
    public void lineOfDuty() {

        for (Company company : companies) {
            company.lineOfDuty();
        }
    }
}
