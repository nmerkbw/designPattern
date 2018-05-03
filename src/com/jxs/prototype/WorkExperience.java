package com.jxs.prototype;

/**
 * Created by jiangxs on 2018/5/3.
 *
 * 工作经历类
 */
public class WorkExperience implements Cloneable {

    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // WorkExperience类实现克隆方法
        return super.clone();
    }
}
