package com.example.hasee.shiyuji.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hasee.shiyuji.R;

/**
 * 该界面是湿热质体质问卷调查的界面，
 * 主要实现给用户显示问卷题目，统计分数的功能
 */
public class wet_hotActivity extends AppCompatActivity implements View.OnClickListener {
    Button wet_hot_confirm;
    Button wet_hot_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wet_hot);
        wet_hot_confirm = findViewById(R.id.wet_hot_confirm);
        wet_hot_back = findViewById(R.id.wet_hot_back);
        wet_hot_confirm.setOnClickListener(this);
        wet_hot_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.wet_hot_confirm:
                break;
            case R.id.wet_hot_back:
                finish();
                break;
                default:
                    break;
        }
    }
}
