package com.jxs.prototype;

/**
 * Created by jiangxs on 2018/5/3.
 *
 * 简历类
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private int age;

    private WorkExperience work;


    public Resume(String name) {

        this.name = name;
        work = new WorkExperience();
    }

    private Resume(WorkExperience work) throws CloneNotSupportedException {

        // 提供clone方法调用的私有构造函数，以便克隆WorkExperience的数据
        this.work = (WorkExperience) work.clone();
    }

    // 设置个人信息
    public void setPersonalInfo(String sex, int age) {

        this.sex = sex;
        this.age = age;
    }

    // 设置工作经历
    public void setWorkExperience(String workDate, String company) {

        work.setWorkDate(workDate);
        work.setCompany(company);
    }

    // 显示
    public void display() {

        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历：" + work.getWorkDate() + " " + work.getCompany());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // 调用私有的构造方法，让WorkExperience克隆完成
        // 然后再给这个Resume对象的相关字段赋值
        // 最终返回一个深赋值的简历对象
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.name;
        obj.age = this.age;
        return obj;
    }
}
