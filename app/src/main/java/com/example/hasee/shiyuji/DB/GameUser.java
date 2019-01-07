package com.example.hasee.shiyuji.DB;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobRelation;

/**
 * 该表对应用户表
 * 用户名和密码属性Bmob用户表自带属性
 * 属性：用户名
 * 密码
 * 通关关卡数
 * 金币
 * 拥有的食物种类
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

    /*
    用户拥有的食物种类
     */
    private BmobRelation having;

    public BmobRelation getHaving() {
        return having;
    }

    public GameUser setHaving(BmobRelation having) {
        this.having = having;
        return this;
    }

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
