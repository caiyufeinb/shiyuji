package com.example.hasee.shiyuji.DB;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobRelation;

/**
 * 凉性食物表
 * 属性，食物id（Bmob自带ObjectId)
 * 食物名字foodName
 * 食物功效，用来评判通关星级effect
 * 关联属性，用来关联用户表，代表用户是否拥有这种食物
 */
public class Cool extends BmobObject {
    private String foodName;

    private String effect;

    private BmobRelation relation;

    public BmobRelation getRelation() {
        return relation;
    }

    public Cool setRelation(BmobRelation relation) {
        this.relation = relation;
        return this;
    }

    public String getFoodName() {
        return foodName;
    }

    public Cool setFoodName(String foodName) {
        this.foodName = foodName;
        return this;
    }

    public String getEffect() {
        return effect;
    }

    public Cool setEffect(String effect) {
        this.effect = effect;
        return this;
    }
}
