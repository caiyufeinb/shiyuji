package com.example.hasee.shiyuji.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.hasee.shiyuji.DB.Cold;
import com.example.hasee.shiyuji.DB.GameUser;
import com.example.hasee.shiyuji.Log.LogUtil;
import com.example.hasee.shiyuji.R;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobRelation;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.UpdateListener;


/**
 * 该界面是选择角色的界面
 * 该界面显示用户的金币，角色介绍
 * 背包（显示用户拥有的卡牌）
 * 抽奖功能（消耗金币来实现抽卡的功能）
 * 签到功能（每天签到给予一定数量的金币）
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton button1 = null; //凤凰图片按钮
    ImageButton button2 = null; //青龙图片按钮
    ImageButton button3 = null; //白虎图片按钮
    ImageButton button4 = null; //玄武图片按钮
    TextView money = null;    //金币显示文本框
    Button signUp = null;   //签到领金币按钮
    Button bag = null;      //背包按钮
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化各个控件
        button1 = findViewById(R.id.btn_1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.btn_2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.btn_3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.btn_4);
        button4.setOnClickListener(this);
        money = findViewById(R.id.money);
        signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(this);
        bag = findViewById(R.id.bag);
        bag.setOnClickListener(this);
        //查询用户当前金币数
        GameUser user = BmobUser.getCurrentUser(GameUser.class);
        money.setText(String.valueOf(user.getMoney()));
        /*测试代码，测试能否添加食物和角色的多对多关联
        结果:测试结果成功
        Cold cold = new Cold();
        cold.setObjectId("43YdMMMe");
        //创建BmobRelation对象
        BmobRelation relation = new BmobRelation();
        //将当前用户添加到食物表中的relation字段值中，表明当前用户拥有该食物
        relation.add(user);
        //多对多关联指向cold的relation字段
        cold.setRelation(relation);
        cold.update(new UpdateListener() {
            @Override
            public void done(BmobException e) {
                if(e == null){
                    LogUtil.v(TAG, "添加关联成功");
                }else{
                    LogUtil.v(TAG, "添加关联失败" + e.getMessage());
                }
            }
        });
        */
        /*
        测试代码，添加人物拥有的食物
         */
        Cold cold = new Cold();
        cold.setObjectId("43YdMMMe");
        BmobRelation relation = new BmobRelation();
        relation.add(cold);
        user.setHaving(relation);
        user.update(new UpdateListener() {
            @Override
            public void done(BmobException e) {
                if(e == null){
                    LogUtil.v(TAG, "添加关联成功");
                }else{
                    LogUtil.v(TAG, "添加关联失败" + e.getMessage());
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_1:
                intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_2:
                intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_3:
                intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_4:
                intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
                break;
            case R.id.bag:
                intent = new Intent(MainActivity.this, BagActivity.class);
                startActivity(intent);
            default:
                break;
        }
    }
}
