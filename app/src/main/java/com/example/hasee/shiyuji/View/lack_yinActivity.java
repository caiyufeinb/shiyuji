package com.example.hasee.shiyuji.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hasee.shiyuji.R;

/**
 * 该界面是平和质体质问卷调查的界面，
 * 主要实现给用户显示问卷题目，统计分数的功能
 */
public class lack_yinActivity extends AppCompatActivity implements View.OnClickListener {
    Button lack_yin_confirm;
    Button lack_yin_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lack_yin);
        lack_yin_confirm = findViewById(R.id.lack_yin_confirm);
        lack_yin_back =  findViewById(R.id.lack_yin_back);
        lack_yin_confirm.setOnClickListener(this);
        lack_yin_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lack_yin_confirm:
                break;
            case R.id.lack_yin_back:
                finish();
                break;
                default:
                    break;
        }
    }
}
