package com.example.hasee.shiyuji.View;

import android.content.Context;
import android.content.DialogInterface;
import android.nfc.Tag;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.hasee.shiyuji.DB.Cold;
import com.example.hasee.shiyuji.DB.Cool;
import com.example.hasee.shiyuji.DB.GameUser;
import com.example.hasee.shiyuji.DB.Hot;
import com.example.hasee.shiyuji.DB.Normal;
import com.example.hasee.shiyuji.DB.Warm;
import com.example.hasee.shiyuji.Log.LogUtil;
import com.example.hasee.shiyuji.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobRelation;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.UpdateListener;

/**
 * 抽卡界面
 * 功能：单抽，十连抽
 * 点击按钮跳出确认界面
 * 点击确认后若金币足够，跳出抽卡结果
 * 否则失败
 */
public class LuckyActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "LuckyActivity";
    //单抽和十连按钮
    Button tenLucky;
    Button oneLucky;
    Context context;
    List<BmobObject> foods;
    List<Integer> foodList;        //存储生成的随机数
    GameUser user = BmobUser.getCurrentUser(GameUser.class);//获取当前用户
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky);
        foods = new ArrayList<>();
        tenLucky = findViewById(R.id.ten_lucky);
        oneLucky = findViewById(R.id.one_lucky);
        tenLucky.setOnClickListener(this);
        oneLucky.setOnClickListener(this);
        context = this;
    }
    /*
    抽卡按钮的点击事件
    点击按钮后跳出确定窗口
    点击确定后跳转到抽卡结果页面
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ten_lucky:
                AlertDialog.Builder confirm = new AlertDialog.Builder(context);
                confirm.setTitle("确认界面");
                confirm.setMessage("你确定花费10000金币来进行十连抽卡吗?");
                confirm.setIcon(R.drawable.ic_done);
                confirm.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        generateRandoms();
                        queryFood();
                    }
                });
                confirm.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                confirm.create();
                confirm.show();
                break;
            case R.id.one_lucky:
                AlertDialog.Builder cancel = new AlertDialog.Builder(context);
                cancel.setTitle("确认界面");
                cancel.setMessage("你确定花费10000金币来进行十连抽卡吗?");
                cancel.setIcon(R.drawable.ic_done);
                cancel.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                cancel.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                cancel.create();
                cancel.show();
                break;
            default:
                break;
        }

    }

    /*
    生成随机数的方法，用来抽取卡片
    从1-401中随机抽取10个数字
     */
    private void generateRandoms(){
        foodList = new ArrayList<>();
        int chance;
        int randomInt;
        for(int i = 0 ; i < 100 ; i ++){
            chance = (int)(Math.random() * 10);
            //平性食物
            if(chance == 0 || chance == 1 || chance == 2 || chance == 3){
                randomInt = (int)(Math.random() * 67) + 1;
                if(! foodList.contains(randomInt)){
                    foodList.add(randomInt);
                } else {
                    LogUtil.v(TAG, "已经存储过该数字");
                }
            }
            //温性食物
            if(chance == 4 || chance == 5){
                randomInt = (int)(Math.random() * 46) + 101;
                if(! foodList.contains(randomInt)){
                    foodList.add(randomInt);
                } else {
                    LogUtil.v(TAG, "已经存储过该数字");
                }
            }
            //良性食物
            if(chance == 6 || chance == 7){
                randomInt = (int)(Math.random() * 30) + 201;
                if(! foodList.contains(randomInt)){
                    foodList.add(randomInt);
                } else {
                    LogUtil.v(TAG, "已经存储过该数字");
                }
            }
            //凉性食物
            if(chance == 8){
                randomInt = (int)(Math.random() * 30) + 301;
                if(! foodList.contains(randomInt)){
                    foodList.add(randomInt);
                } else {
                    LogUtil.v(TAG, "已经存储过该数字");
                }
            }
            //热性食物
            if(chance == 9){
                randomInt = 401;
                if(! foodList.contains(randomInt)){
                    foodList.add(randomInt);
                } else {
                    LogUtil.v(TAG, "已经存储过该数字");
                }
            }
            //抽到十个不同的食物后，跳出循环
            if(foodList.size() == 10){
                break;
            }
        }
    }

    /*
    根据食物id查询食物的方法
    先获取食物id
    在根据id查询到相应食物
    再添加到任务背包
     */
    public void queryFood(){
        for(int i = 0 ; i < foodList.size() ; i ++){
            //如果是平性食物
            if(foodList.get(i) <= 100){
                BmobQuery<Normal> queryNormal = new BmobQuery<>();
                queryNormal.addWhereEqualTo("foodId", foodList.get(i));
                queryNormal.findObjects(new FindListener<Normal>() {
                    @Override
                    public void done(List<Normal> list, BmobException e) {
                        if(e == null){
                            //将食物添加到背包
                            final Normal normal = list.get(0);//获取当前食物
                            foods.add(normal);                //将食物添加到数组中，用于之后在RecyclerView中显示抽卡结果
                            BmobRelation relation = new BmobRelation();
                            relation.add(normal);
                            user.setHaving(relation);
                            user.update(new UpdateListener() {
                                @Override
                                public void done(BmobException e) {
                                    if(e==null){
                                        LogUtil.v(TAG,"添加食物" + normal.getFoodName() + "成功");
                                    }else{
                                        LogUtil.v(TAG,"添加食物" + normal.getFoodName() + "失败："+e.getMessage());
                                    }
                                }
                            });
                        }
                    }
                });
            }

            //如果是温性食物
            if(foodList.get(i) > 100 && foodList.get(i) <= 146){
                BmobQuery<Warm> queryWarm = new BmobQuery<>();
                queryWarm.addWhereEqualTo("foodId", foodList.get(i));
                queryWarm.findObjects(new FindListener<Warm>() {
                    @Override
                    public void done(List<Warm> list, BmobException e) {
                        if(e == null){
                            //将食物添加到背包
                            final Warm warm = list.get(0);//获取当前食物
                            foods.add(warm);                //将食物添加到数组中，用于之后在RecyclerView中显示抽卡结果
                            BmobRelation relation = new BmobRelation();
                            relation.add(warm);
                            user.setHaving(relation);   //将食物添加到背包中
                            user.update(new UpdateListener() {
                                @Override
                                public void done(BmobException e) {
                                    if(e==null){
                                        LogUtil.v(TAG,"添加食物" + warm.getFoodName() + "成功");
                                    }else{
                                        LogUtil.v(TAG,"添加食物" + warm.getFoodName() + "失败："+e.getMessage());
                                    }
                                }
                            });
                        }
                    }
                });
            }

            //如果是凉性食物
            if(foodList.get(i) > 200 && foodList.get(i) <= 230){
                BmobQuery<Cool> queryCool = new BmobQuery<>();
                queryCool.addWhereEqualTo("foodId", foodList.get(i));
                queryCool.findObjects(new FindListener<Cool>() {
                    @Override
                    public void done(List<Cool> list, BmobException e) {
                        if(e == null){
                            //将食物添加到背包
                            final Cool cool = list.get(0);//获取当前食物
                            foods.add(cool);                //将食物添加到数组中，用于之后在RecyclerView中显示抽卡结果
                            BmobRelation relation = new BmobRelation();
                            relation.add(cool);
                            user.setHaving(relation);   //将食物添加到背包中
                            user.update(new UpdateListener() {
                                @Override
                                public void done(BmobException e) {
                                    if(e==null){
                                        LogUtil.v(TAG,"添加食物" + cool.getFoodName() + "成功");
                                    }else{
                                        LogUtil.v(TAG,"添加食物" + cool.getFoodName() + "失败："+e.getMessage());
                                    }
                                }
                            });
                        }
                    }
                });
            }

            //如果是寒性食物
            if(foodList.get(i) > 300 && foodList.get(i) <= 330){
                BmobQuery<Cold> queryCold = new BmobQuery<>();
                queryCold.addWhereEqualTo("foodId", foodList.get(i));
                queryCold.findObjects(new FindListener<Cold>() {
                    @Override
                    public void done(List<Cold> list, BmobException e) {
                        if(e == null){
                            //将食物添加到背包
                            final Cold cold = list.get(0);//获取当前食物
                            foods.add(cold);                //将食物添加到数组中，用于之后在RecyclerView中显示抽卡结果
                            BmobRelation relation = new BmobRelation();
                            relation.add(cold);
                            user.setHaving(relation);   //将食物添加到背包中
                            user.update(new UpdateListener() {
                                @Override
                                public void done(BmobException e) {
                                    if(e==null){
                                        LogUtil.v(TAG,"添加食物" + cold.getFoodName() + "成功");
                                    }else{
                                        LogUtil.v(TAG,"添加食物" + cold.getFoodName() + "失败："+e.getMessage());
                                    }
                                }
                            });
                        }
                    }
                });
            }

            //如果是热性食物
            if(foodList.get(i) == 401){
                BmobQuery<Hot> queryHot = new BmobQuery<>();
                queryHot.addWhereEqualTo("foodId", foodList.get(i));
                queryHot.findObjects(new FindListener<Hot>() {
                    @Override
                    public void done(List<Hot> list, BmobException e) {
                        if(e == null){
                            //将食物添加到背包
                            final Hot hot = list.get(0);//获取当前食物
                            foods.add(hot);                //将食物添加到数组中，用于之后在RecyclerView中显示抽卡结果
                            BmobRelation relation = new BmobRelation();
                            relation.add(hot);
                            user.setHaving(relation);   //将食物添加到背包中
                            user.update(new UpdateListener() {
                                @Override
                                public void done(BmobException e) {
                                    if(e==null){
                                        LogUtil.v(TAG,"添加食物" + hot.getFoodName() + "成功");
                                    }else{
                                        LogUtil.v(TAG,"添加食物" + hot.getFoodName() + "失败："+e.getMessage());
                                    }
                                }
                            });
                        }
                    }
                });
            }


        }
    }



}
