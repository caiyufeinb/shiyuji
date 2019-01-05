package com.example.hasee.shiyuji.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hasee.shiyuji.DB.GameUser;
import com.example.hasee.shiyuji.Dao.GameUserDao;
import com.example.hasee.shiyuji.Log.LogUtil;
import com.example.hasee.shiyuji.R;
import com.example.hasee.shiyuji.Test.User;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.QueryListener;


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
    private TextView money = null;    //金币显示文本框
    private Button signUp = null;   //签到领金币按钮
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
        //查询用户当前金币数
        GameUser user = BmobUser.getCurrentUser(GameUser.class);
        money.setText(String.valueOf(user.getMoney()));
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
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
            default:
                break;
        }
    }
}
