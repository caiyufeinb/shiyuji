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
public class bloodActivity extends AppCompatActivity implements View.OnClickListener {
    Button blood_confirm;
    Button blood_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);
        blood_confirm = findViewById(R.id.blood_confirm);
        blood_back = findViewById(R.id.blood_back);
        blood_confirm.setOnClickListener(this);
        blood_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.blood_confirm:
                break;
            case R.id.blood_back:
                finish();
                break;
                default:
                    break;
        }
    }
}
