package com.example.hasee.shiyuji.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hasee.shiyuji.R;

/**
 * 该界面用来选择进入游戏，选择调查问卷还是进入论坛
 */
public class choiseActivity extends AppCompatActivity implements View.OnClickListener {
    Button enterGame;//进入游戏按钮
    Button constitution;//进入问卷按钮
    Button forum;//进入论坛按钮
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choise);
        //实例化控件阶段
        enterGame = findViewById(R.id.enterGame);
        constitution = findViewById(R.id.constitution);
        forum = findViewById(R.id.forum);
        enterGame.setOnClickListener(this);
        constitution.setOnClickListener(this);
        forum.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.enterGame:
                intent = new Intent(choiseActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.constitution:
                intent = new Intent(choiseActivity.this, ConstitutionActivity.class);
                startActivity(intent);
                break;
            case R.id.forum:
                break;
            default:
                break;
        }
    }
}
