package com.example.hasee.shiyuji.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.hasee.shiyuji.Log.LogUtil;
import com.example.hasee.shiyuji.R;

/**
 * 该界面是平和质体质问卷调查的界面，
 * 主要实现给用户显示问卷题目，统计分数的功能
 */
public class bloodActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "bloodActivity";
    Button blood_confirm;
    Button blood_back;
    //七个血瘀质问题分组
    RadioGroup blood_1;
    RadioGroup blood_2;
    RadioGroup blood_3;
    RadioGroup blood_4;
    RadioGroup blood_5;
    RadioGroup blood_6;
    RadioGroup blood_7;
    //单选按钮声明
    RadioButton score_one_blood1;
    RadioButton score_one_blood2;
    RadioButton score_one_blood3;
    RadioButton score_one_blood4;
    RadioButton score_one_blood5;
    RadioButton score_one_blood6;
    RadioButton score_one_blood7;
    RadioButton score_two_blood1;
    RadioButton score_two_blood2;
    RadioButton score_two_blood3;
    RadioButton score_two_blood4;
    RadioButton score_two_blood5;
    RadioButton score_two_blood6;
    RadioButton score_two_blood7;
    RadioButton score_three_blood1;
    RadioButton score_three_blood2;
    RadioButton score_three_blood3;
    RadioButton score_three_blood4;
    RadioButton score_three_blood5;
    RadioButton score_three_blood6;
    RadioButton score_three_blood7;
    RadioButton score_four_blood1;
    RadioButton score_four_blood2;
    RadioButton score_four_blood3;
    RadioButton score_four_blood4;
    RadioButton score_four_blood5;
    RadioButton score_four_blood6;
    RadioButton score_four_blood7;
    RadioButton score_five_blood1;
    RadioButton score_five_blood2;
    RadioButton score_five_blood3;
    RadioButton score_five_blood4;
    RadioButton score_five_blood5;
    RadioButton score_five_blood6;
    RadioButton score_five_blood7;
    //存储该阶段问题的总分数
    int score = 0;
    //存储每个问题的得分
    int score_1 = 0;
    int score_2 = 0;
    int score_3 = 0;
    int score_4 = 0;
    int score_5 = 0;
    int score_6 = 0;
    int score_7 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);
        blood_confirm = findViewById(R.id.blood_confirm);
        blood_back = findViewById(R.id.blood_back);
        blood_confirm.setOnClickListener(this);
        blood_back.setOnClickListener(this);
        blood_1 = findViewById(R.id.blood_1);
        blood_2 = findViewById(R.id.blood_2);
        blood_3 = findViewById(R.id.blood_3);
        blood_4 = findViewById(R.id.blood_4);
        blood_5 = findViewById(R.id.blood_5);
        blood_6 = findViewById(R.id.blood_6);
        blood_7 = findViewById(R.id.blood_7);
        score_one_blood1 = findViewById(R.id.score_one_blood1);
        score_one_blood2 = findViewById(R.id.score_one_blood2);
        score_one_blood3 = findViewById(R.id.score_one_blood3);
        score_one_blood4 = findViewById(R.id.score_one_blood4);
        score_one_blood5 = findViewById(R.id.score_one_blood5);
        score_one_blood6 = findViewById(R.id.score_one_blood6);
        score_one_blood7 = findViewById(R.id.score_one_blood7);
        score_two_blood1 = findViewById(R.id.score_two_blood1);
        score_two_blood2 = findViewById(R.id.score_two_blood2);
        score_two_blood3 = findViewById(R.id.score_two_blood3);
        score_two_blood4 = findViewById(R.id.score_two_blood4);
        score_two_blood5 = findViewById(R.id.score_two_blood5);
        score_two_blood6 = findViewById(R.id.score_two_blood6);
        score_two_blood7 = findViewById(R.id.score_two_blood7);
        score_three_blood1 = findViewById(R.id.score_three_blood1);
        score_three_blood2 = findViewById(R.id.score_three_blood2);
        score_three_blood3 = findViewById(R.id.score_three_blood3);
        score_three_blood4 = findViewById(R.id.score_three_blood4);
        score_three_blood5 = findViewById(R.id.score_three_blood5);
        score_three_blood6 = findViewById(R.id.score_three_blood6);
        score_three_blood7 = findViewById(R.id.score_three_blood7);
        score_four_blood1 = findViewById(R.id.score_four_blood1);
        score_four_blood2 = findViewById(R.id.score_four_blood2);
        score_four_blood3 = findViewById(R.id.score_four_blood3);
        score_four_blood4 = findViewById(R.id.score_four_blood4);
        score_four_blood5 = findViewById(R.id.score_four_blood5);
        score_four_blood6 = findViewById(R.id.score_four_blood6);
        score_four_blood7 = findViewById(R.id.score_four_blood7);
        score_five_blood1 = findViewById(R.id.score_five_blood1);
        score_five_blood2 = findViewById(R.id.score_five_blood2);
        score_five_blood3 = findViewById(R.id.score_five_blood3);
        score_five_blood4 = findViewById(R.id.score_five_blood4);
        score_five_blood5 = findViewById(R.id.score_five_blood5);
        score_five_blood6 = findViewById(R.id.score_five_blood6);
        score_five_blood7 = findViewById(R.id.score_five_blood7);
        //每次开始做问卷的时候将分数清零
        if(score != 0){
            score = 0;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.blood_confirm:
               //计算第一题分数
                for(int i = 0 ; i < blood_1.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)blood_1.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_1 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第一题分数是" + ":" + score_1);

                //计算第二题分数
                for(int i = 0 ; i < blood_2.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)blood_2.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_2 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_2);

                //计算第三题分数
                for(int i = 0 ; i < blood_3.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)blood_3.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_3 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_3);

                //计算第四题分数
                for(int i = 0 ; i < blood_4.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)blood_4.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_4 = i + 1;

                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_4);
                //计算第五题分数
                for(int i = 0 ; i < blood_5.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)blood_5.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_5 = i + 1;

                    }
                }
                LogUtil.v(TAG, "第五题分数是" + ":" + score_5);

                //计算第六题分数
                for(int i = 0 ; i < blood_6.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)blood_6.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_6 = i + 1;

                    }
                }
                LogUtil.v(TAG, "第六题分数是" + ":" + score_6);

                //计算第七题分数
                for(int i = 0 ; i < blood_7.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)blood_7.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_7 = i + 1;

                    }
                }
                LogUtil.v(TAG, "第七题分数是" + ":" + score_7);
                //计算总分数
                score = score_1 + score_2 + score_3 + score_4 + score_5 + score_6 + score_7;
                Toast.makeText(bloodActivity.this, "你的得分是" + ":" + score + "分", Toast.LENGTH_LONG).show();
                break;
            case R.id.blood_back:
                //将分数清零
                score = 0;
                finish();
                break;
                default:
                    break;
        }
    }
}
