package com.example.hasee.shiyuji.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hasee.shiyuji.R;

/**
 * 该界面是痰湿质体质问卷调查的界面，
 * 主要实现给用户显示问卷题目，统计分数的功能
 */
public class phlegm_wetActivity extends AppCompatActivity implements View.OnClickListener{
    Button phlegm_wet_confirm;
    Button phlegm_wet_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phlegm_wet);
        phlegm_wet_confirm = findViewById(R.id.phlegm_wet_confirm);
        phlegm_wet_back = findViewById(R.id.phlegm_wet_back);
        phlegm_wet_back.setOnClickListener(this);
        phlegm_wet_confirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.phlegm_wet_confirm:
                break;
            case R.id.phlegm_wet_back:
                finish();
                break;
                default:
                    break;
        }
    }
}
