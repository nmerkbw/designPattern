package com.jxs.compositeExample;

/**
 * Created by jiangxs on 2018/5/10.
 */
public class Client {

    public static void main(String[] args) {

        ConcreteCompany rootCompany = new ConcreteCompany("北京总公司");
        rootCompany.add(new HRDepartment("总公司人力资源部"));
        rootCompany.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany company = new ConcreteCompany("上海华东分公司");
        company.add(new HRDepartment("华东分公司人力资源部"));
        company.add(new FinanceDepartment("华东分公司财务部"));
        rootCompany.add(company);

        ConcreteCompany company1 = new ConcreteCompany("南京办事处");
        company1.add(new HRDepartment("南京办事处人力资源部"));
        company1.add(new FinanceDepartment("南京办事处财务部"));
        company.add(company1);

        ConcreteCompany company2 = new ConcreteCompany("杭州办事处");
        company2.add(new HRDepartment("杭州办事处人力资源部"));
        company2.add(new FinanceDepartment("杭州办事处财务部"));
        company.add(company2);

        System.out.println("结构图：");
        rootCompany.display(1);

        System.out.println("\n职责：");
        rootCompany.lineOfDuty();
    }
}
