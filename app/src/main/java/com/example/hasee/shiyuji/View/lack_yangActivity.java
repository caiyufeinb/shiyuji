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
public class lack_yangActivity extends AppCompatActivity implements View.OnClickListener{
    //两个按钮实现统计分数和返回功能
    Button lack_yang_confirm;
    Button lack_yang_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lack_yang);
        lack_yang_back = findViewById(R.id.lack_yang_back);
        lack_yang_confirm = findViewById(R.id.lack_yang_confirm);
        lack_yang_confirm.setOnClickListener(this);
        lack_yang_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lack_yang_confirm:
                break;
            case R.id.lack_yang_back:
                finish();
                break;
                default:
                    break;
        }
    }
}
