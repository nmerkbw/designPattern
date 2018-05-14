package com.jxs.flyweightExample;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        WebsiteFactory factory = new WebsiteFactory();

        Website fx = factory.getWebsiteCategory("产品展示");
        fx.use(new User("小菜"));

        Website fy = factory.getWebsiteCategory("产品展示");
        fy.use(new User("大鸟"));

        Website fz = factory.getWebsiteCategory("产品展示");
        fy.use(new User("娇娇"));

        Website f1 = factory.getWebsiteCategory("博客");
        f1.use(new User("老顽童"));

        Website f2 = factory.getWebsiteCategory("博客");
        f2.use(new User("桃谷六仙"));

        Website f3 = factory.getWebsiteCategory("博客");
        f3.use(new User("南海鳄神"));

        System.out.println("得到网站的分类总数为：" + factory.getWebsiteCount());
    }
}
