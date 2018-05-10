package com.jxs.observerWithDelegate;

import java.util.Date;

/**
 * Created by jiangxs on 2018/5/8.
 *
 * 在上班时间看NBA的员工
 */
public class NBAListener {

    public void watchingNBA() {

        System.out.println("看球员工在看NBA" + " " + new Date());
    }

    public void stopWatchNBA() {

        System.out.println("老板来了，关闭NBA直播" + " " + new Date());
    }
}
