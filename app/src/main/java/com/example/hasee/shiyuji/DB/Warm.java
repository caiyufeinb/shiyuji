package com.example.hasee.shiyuji.DB;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobRelation;

/**
 * 温性食物表
 * 属性，食物id（Bmob自带ObjectId)
 * 食物名字foodName
 * 食物功效，用来评判通关星级effect
 * 关联属性，用来关联用户表，代表用户是否拥有这种食物
 * 图片id，存放食物的图片存放的位置
 */
public class Warm extends BmobObject {
    private String foodName;

    private String effect;

    private BmobRelation relation;

    private Integer imageId;

    private Integer foodId;

    public Integer getFoodId(){
        return foodId;
    }

    public Warm setFoodId(Integer foodId){
        this.foodId = foodId;
        return this;
    }

    public Integer getImageId() {
        return imageId;
    }

    public Warm setImageId(Integer imageId) {
        this.imageId = imageId;
        return this;
    }

    public BmobRelation getRelation() {
        return relation;
    }

    public Warm setRelation(BmobRelation relation) {
        this.relation = relation;
        return this;
    }

    public String getFoodName() {
        return foodName;
    }

    public Warm setFoodName(String foodName) {
        this.foodName = foodName;
        return this;
    }

    public String getEffect() {
        return effect;
    }

    public Warm setEffect(String effect) {
        this.effect = effect;
        return this;
    }
}
