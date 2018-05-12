package com.jxs.chainOfResponsibilityExample;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * Request类
 * 用于员工对上级的一些申请，例如请假和加薪等
 */
public class Request {

    // 申请类型
    private String requestType;
    // 申请内容
    private String requestContent;
    // 数量
    private int number;

    public String getRequestType() {

        return requestType;
    }

    public void setRequestType(String requestType) {

        this.requestType = requestType;
    }

    public String getRequestContent() {

        return requestContent;
    }

    public void setRequestContent(String requestContent) {

        this.requestContent = requestContent;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }
}
