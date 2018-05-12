package com.jxs.chainOfResponsibilityExample;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * 客户端
 * 向链上的具体处理者对象提交请求
 */
public class Client {

    public static void main(String[] args) {

        CommonManager jinli = new CommonManager("金利");
        Majordomo zongjian = new Majordomo("宗建");
        GeneralManager zongjingli = new GeneralManager("钟精利");
        // 设置上级
        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zongjingli);

        Request request1 = new Request();
        commitRequest(request1,"请假","小菜请假",1);
        jinli.requestApplications(request1);

        Request request2 = new Request();
        commitRequest(request2,"请假","小菜请假",4);
        jinli.requestApplications(request2);

        Request request3 = new Request();
        commitRequest(request3, "加薪", "小菜加薪", 1000);
        jinli.requestApplications(request3);

        Request request4 = new Request();
        commitRequest(request4, "加薪", "小菜加薪", 5000);
        jinli.requestApplications(request4);
    }

    public static void commitRequest(Request request, String requestType
            , String requestContent, int requestNumber) {

        request.setRequestType(requestType);
        request.setRequestContent(requestContent);
        request.setNumber(requestNumber);
    }
}

