package com.jxs.factory;

/**
 * Created by jiangxs on 2018/5/3.
 */
public interface IFactory {

    LeiFeng createLeiFeng();
}

// 学雷锋的大学生工厂
class UndergraduateFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {

        return new Undergraduate();
    }
}

// 社区志愿者工厂
class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}