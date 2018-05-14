package com.jxs.flyweightExample;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * WebsiteFactory类
 * 网站工厂类（相当于FlyweightFactory）
 */
public class WebsiteFactory {

    private Map<String, ConcreteWebsite> websites = new HashMap<>();

    // 获得网站分类
    public Website getWebsiteCategory(String key) {

        if (!websites.containsKey(key)) {
            websites.put(key, new ConcreteWebsite(key));
        }
        return websites.get(key);
    }

    // 获得网站分类总数
    public int getWebsiteCount() {

        return websites.size();
    }
}
