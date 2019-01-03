package com.example.hasee.shiyuji.DB;

import cn.bmob.v3.BmobObject;

/**
 * 寒性食物表
 * 属性，食物id（Bmob自带ObjectId)
 * 食物名字foodName
 * 食物功效，用来评判通关星级effect
 */
public class cold extends BmobObject {
    private String foodName;

    private String effect;

    public String getFoodName() {
        return foodName;
    }

    public cold setFoodName(String foodName) {
        this.foodName = foodName;
        return this;
    }

    public String getEffect() {
        return effect;
    }

    public cold setEffect(String effect) {
        this.effect = effect;
        return this;
    }
}
