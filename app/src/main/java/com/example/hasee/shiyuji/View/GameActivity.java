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

    private Button game1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        game1 = findViewById(R.id.one);
        game1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.one:
                Intent intent = new Intent(GameActivity.this, questionActivity.class);
                startActivity(intent);
                break;

        }
    }
}
