package com.example.hasee.shiyuji.Dao;


import android.content.Context;
import android.widget.Toast;

import com.example.hasee.shiyuji.DB.Cold;
import com.example.hasee.shiyuji.DB.Normal;
import com.example.hasee.shiyuji.Log.LogUtil;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * 该类用来进行和平性食物数据库有关的操作
 * 主要包括
 * 1.保存数据
 * 2.更新数据
 * 3.更新数据
 * 4.删除数据
 */
public class normalDao {
    private static final String TAG = "normalDao";
    public static void addData(String foodName, String effect, final Context context){
        Normal normal = new Normal();
        normal.setFoodName(foodName);
        normal.setEffect(effect);
        normal.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if(e == null){
                    LogUtil.v(TAG, "添加数据成功平性");
                }else{
                    Toast.makeText(context, "添加数据失败", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
