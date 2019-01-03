package com.example.hasee.shiyuji.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.hasee.shiyuji.R;

import cn.bmob.v3.Bmob;

/**
 * 该界面是选择角色的界面
 * 该界面显示用户的金币，角色介绍
 * 背包（显示用户拥有的卡牌）
 * 抽奖功能（消耗金币来实现抽卡的功能）
 * 签到功能（每天签到给予一定数量的金币）
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton button1 = null;
    ImageButton button2 = null;
    ImageButton button3 = null;
    ImageButton button4 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.btn_1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.btn_2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.btn_3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.btn_4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
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
