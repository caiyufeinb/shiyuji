package com.example.hasee.shiyuji.DB;

import cn.bmob.v3.BmobUser;

/**
 * 该表对应用户表
 * 用户名和密码属性Bmob用户表自带属性
 * 属性：用户名
 * 密码
 * 通关关卡数
 * 金币
 */
public class GameUser extends BmobUser {
    /*
    通关关卡数
     */
    private Integer mission;
    /*
    拥有金币
     */
    private Double money;

    public Integer getMission() {
        return mission;
    }

    public GameUser setMission(Integer mission) {
        this.mission = mission;
        return this;
    }

    public Double getMoney() {
        return money;
    }

    public GameUser setMoney(Double money) {
        this.money = money;
        return this;
    }
}
