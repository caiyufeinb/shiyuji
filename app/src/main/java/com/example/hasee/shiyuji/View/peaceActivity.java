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
public class peaceActivity extends AppCompatActivity implements View.OnClickListener{
    Button peace_confirm;
    Button peace_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peace);
        peace_confirm = findViewById(R.id.peace_confirm);
        peace_back = findViewById(R.id.peace_back);
        peace_confirm.setOnClickListener(this);
        peace_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.peace_confirm:
                break;
            case R.id.peace_back:
                finish();
                break;
            default:
                break;
        }
    }
}
