package com.example.hasee.shiyuji.Dao;


import android.content.Context;
import android.widget.Toast;

import com.example.hasee.shiyuji.DB.Cold;
import com.example.hasee.shiyuji.DB.Cool;
import com.example.hasee.shiyuji.Log.LogUtil;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * 该类用来进行和凉性食物数据库有关的操作
 * 主要包括
 * 1.保存数据
 * 2.更新数据
 * 3.更新数据
 * 4.删除数据
 */
public class coolDao {
    private static final String TAG = "coolDao";

    public static void addData(String foodName, String effect, final Context context) {
        Cool cool = new Cool();
        cool.setFoodName(foodName);
        cool.setEffect(effect);
        cool.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if (e == null) {
                    LogUtil.v(TAG, "添加数据成功凉性");
                } else {
                    Toast.makeText(context, "添加数据失败", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
