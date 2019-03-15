package com.example.hasee.shiyuji.View;

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
public class peaceActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "peaceActivity";
    Button peace_confirm;
    Button peace_back;
    //问题分组声明
    RadioGroup peace1;
    RadioGroup peace2;
    RadioGroup peace3;
    RadioGroup peace4;
    RadioGroup peace5;
    RadioGroup peace6;
    RadioGroup peace7;
    RadioGroup peace8;
    //问题按钮声明
    RadioButton score_one_peace1;
    RadioButton score_one_peace2;
    RadioButton score_one_peace3;
    RadioButton score_one_peace4;
    RadioButton score_one_peace5;
    RadioButton score_one_peace6;
    RadioButton score_one_peace7;
    RadioButton score_one_peace8;

    RadioButton score_two_peace1;
    RadioButton score_two_peace2;
    RadioButton score_two_peace3;
    RadioButton score_two_peace4;
    RadioButton score_two_peace5;
    RadioButton score_two_peace6;
    RadioButton score_two_peace7;
    RadioButton score_two_peace8;

    RadioButton score_three_peace1;
    RadioButton score_three_peace2;
    RadioButton score_three_peace3;
    RadioButton score_three_peace4;
    RadioButton score_three_peace5;
    RadioButton score_three_peace6;
    RadioButton score_three_peace7;
    RadioButton score_three_peace8;

    RadioButton score_four_peace1;
    RadioButton score_four_peace2;
    RadioButton score_four_peace3;
    RadioButton score_four_peace4;
    RadioButton score_four_peace5;
    RadioButton score_four_peace6;
    RadioButton score_four_peace7;
    RadioButton score_four_peace8;

    RadioButton score_five_peace1;
    RadioButton score_five_peace2;
    RadioButton score_five_peace3;
    RadioButton score_five_peace4;
    RadioButton score_five_peace5;
    RadioButton score_five_peace6;
    RadioButton score_five_peace7;
    RadioButton score_five_peace8;
    //总分数
    int score = 0;
    //各个问题的分数
    int score_1 = 0;
    int score_2 = 0;
    int score_3 = 0;
    int score_4 = 0;
    int score_5 = 0;
    int score_6 = 0;
    int score_7 = 0;
    int score_8 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peace);
        peace_confirm = findViewById(R.id.peace_confirm);
        peace_back = findViewById(R.id.peace_back);
        peace_confirm.setOnClickListener(this);
        peace_back.setOnClickListener(this);
        //实例化控件
        peace1 = findViewById(R.id.peace_1);
        peace2 = findViewById(R.id.peace_2);
        peace3 = findViewById(R.id.peace_3);
        peace4 = findViewById(R.id.peace_4);
        peace5 = findViewById(R.id.peace_5);
        peace6 = findViewById(R.id.peace_6);
        peace7 = findViewById(R.id.peace_7);
        peace8 = findViewById(R.id.peace_8);

        score_one_peace1 = findViewById(R.id.score_one_peace1);
        score_one_peace2 = findViewById(R.id.score_one_peace2);
        score_one_peace3 = findViewById(R.id.score_one_peace3);
        score_one_peace4 = findViewById(R.id.score_one_peace4);
        score_one_peace5 = findViewById(R.id.score_one_peace5);
        score_one_peace6 = findViewById(R.id.score_one_peace6);
        score_one_peace7 = findViewById(R.id.score_one_peace7);
        score_one_peace8 = findViewById(R.id.score_one_peace8);

        score_two_peace1 = findViewById(R.id.score_two_peace1);
        score_two_peace2 = findViewById(R.id.score_two_peace2);
        score_two_peace3 = findViewById(R.id.score_two_peace3);
        score_two_peace4 = findViewById(R.id.score_two_peace4);
        score_two_peace5 = findViewById(R.id.score_two_peace5);
        score_two_peace6 = findViewById(R.id.score_two_peace6);
        score_two_peace7 = findViewById(R.id.score_two_peace7);
        score_two_peace8 = findViewById(R.id.score_two_peace8);

        score_three_peace1 = findViewById(R.id.score_three_peace1);
        score_three_peace2 = findViewById(R.id.score_three_peace2);
        score_three_peace3 = findViewById(R.id.score_three_peace3);
        score_three_peace4 = findViewById(R.id.score_three_peace4);
        score_three_peace5 = findViewById(R.id.score_three_peace5);
        score_three_peace6 = findViewById(R.id.score_three_peace6);
        score_three_peace7 = findViewById(R.id.score_three_peace7);
        score_three_peace8 = findViewById(R.id.score_three_peace8);

        score_four_peace1 = findViewById(R.id.score_four_peace1);
        score_four_peace2 = findViewById(R.id.score_four_peace2);
        score_four_peace3 = findViewById(R.id.score_four_peace3);
        score_four_peace4 = findViewById(R.id.score_four_peace4);
        score_four_peace5 = findViewById(R.id.score_four_peace5);
        score_four_peace6 = findViewById(R.id.score_four_peace6);
        score_four_peace7 = findViewById(R.id.score_four_peace7);
        score_four_peace8 = findViewById(R.id.score_four_peace8);

        score_five_peace1 = findViewById(R.id.score_five_peace1);
        score_five_peace2 = findViewById(R.id.score_five_peace2);
        score_five_peace3 = findViewById(R.id.score_five_peace3);
        score_five_peace4 = findViewById(R.id.score_five_peace4);
        score_five_peace5 = findViewById(R.id.score_five_peace5);
        score_five_peace6 = findViewById(R.id.score_five_peace6);
        score_five_peace7 = findViewById(R.id.score_five_peace7);
        score_five_peace8 = findViewById(R.id.score_five_peace8);
        //每次开始做问卷的时候将分数清零
        if(score != 0){
            score = 0;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.peace_confirm:
                //计算第一题分数
                for(int i = 0 ; i < peace1.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)peace1.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_1 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第一题分数是" + ":" + score_1);

                //计算第二题分数
                for(int i = 0 ; i < peace2.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)peace2.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_2 = 6 - i;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_2);

                //计算第三题分数
                for(int i = 0 ; i < peace3.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)peace3.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_3 = 6 - i;
                    }
                }
                LogUtil.v(TAG, "第三题分数是" + ":" + score_3);

                //计算第四题分数
                for(int i = 0 ; i < peace4.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)peace4.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_4 = 6 - i;
                    }
                }
                LogUtil.v(TAG, "第四题分数是" + ":" + score_4);

                //计算第五题分数
                for(int i = 0 ; i < peace5.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)peace5.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_5 = 6 - i;
                    }
                }
                LogUtil.v(TAG, "第五题分数是" + ":" + score_5);

                //计算第六题分数
                for(int i = 0 ; i < peace6.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)peace6.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_6 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第六题分数是" + ":" + score_6);

                //计算第七题分数
                for(int i = 0 ; i < peace7.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)peace7.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_7 = 6 - i;
                    }
                }
                LogUtil.v(TAG, "第七题分数是" + ":" + score_6);

                //计算第八题分数
                for(int i = 0 ; i < peace8.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)peace8.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_8 = 6 - i;
                    }
                }
                LogUtil.v(TAG, "第八题分数是" + ":" + score_8);
                //计算总分数
                score  = score_1 + score_2 + score_3 + score_4 + score_5 + score_6 + score_7 + score_8;
                Toast.makeText(peaceActivity.this, "你的得分是" + ":" + score + "分", Toast.LENGTH_LONG).show();

                break;
            case R.id.peace_back:
                //分数清零
                score = 0;
                finish();
                break;
            default:
                break;
        }
    }
}
