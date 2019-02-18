package com.example.hasee.shiyuji.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hasee.shiyuji.R;

/**
 * 该界面是选择角色之后的闯关界面关卡
 */
public class GameActivity extends AppCompatActivity implements View.OnClickListener{
    //表示玩家正在进行哪个关卡
    public static boolean GAME1 = false;
    public static boolean GAME2 = false;
    public static boolean GAME3 = false;
    public static boolean GAME4 = false;
    public static boolean GAME5 = false;
    public static boolean GAME6 = false;
    public static boolean GAME7 = false;

    /*
    给按钮添加闯关逻辑
     */
    private Button game1;
    private Button game2;
    private Button game3;
    private Button game4;
    private Button game5;
    private Button game6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        game1 = findViewById(R.id.one);
        game1.setOnClickListener(this);
        game2 = findViewById(R.id.two);
        game2.setOnClickListener(this);
        game3 = findViewById(R.id.three);
        game3.setOnClickListener(this);
        game4 = findViewById(R.id.four);
        game4.setOnClickListener(this);
        game5 = findViewById(R.id.five);
        game5.setOnClickListener(this);
        game6 = findViewById(R.id.six);
        game6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.one:
                intent = new Intent(GameActivity.this, questionActivity.class);
                startActivity(intent);
                break;
            case R.id.two:
                intent = new Intent(GameActivity.this, questionActivity.class);
                startActivity(intent);
                break;
            case R.id.three:
                intent = new Intent(GameActivity.this, questionActivity.class);
                startActivity(intent);
                break;
            case R.id.four:
                intent = new Intent(GameActivity.this, questionActivity.class);
                startActivity(intent);
                break;
            case R.id.five:
                intent = new Intent(GameActivity.this, questionActivity.class);
                startActivity(intent);
                break;
            case R.id.six:
                intent = new Intent(GameActivity.this, questionActivity.class);
                startActivity(intent);
                break;

        }
    }
}
