package com.example.hasee.shiyuji.DB;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobRelation;

/**
 * 寒性食物表
 * 属性，食物id（Bmob自带ObjectId)
 * 食物名字foodName
 * 食物功效，用来评判通关星级effect
 * 关联属性，用来关联用户表，代表用户是否拥有这种食物
 * 图片id，存放食物的图片存放的位置
 * foodId,给食物编号，代表食物的稀有度
 */
public class Cold extends BmobObject {
    private String foodName;

    private String effect;

    private BmobRelation relation;

    private Integer imageId;

    private Integer foodId;

    public Integer getFoodId(){
        return foodId;
    }

    public Cold setFoodId(Integer foodId){
        this.foodId = foodId;
        return this;
    }

    public Integer getImageId() {
        return imageId;
    }

    public Cold setImageId(Integer imageId) {
        this.imageId = imageId;
        return this;
    }



    public BmobRelation getRelation() {
        return relation;
    }

    public Cold setRelation(BmobRelation relation) {
        this.relation = relation;
        return this;
    }

    public String getFoodName() {
        return foodName;
    }

    public Cold setFoodName(String foodName) {
        this.foodName = foodName;
        return this;
    }

    public String getEffect() {
        return effect;
    }

    public Cold setEffect(String effect) {
        this.effect = effect;
        return this;
    }
}
