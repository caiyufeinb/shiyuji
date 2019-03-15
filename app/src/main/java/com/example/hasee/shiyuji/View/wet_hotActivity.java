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
 * 该界面是湿热质体质问卷调查的界面，
 * 主要实现给用户显示问卷题目，统计分数的功能
 */
public class wet_hotActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "wet_hotActivity";
    Button wet_hot_confirm;
    Button wet_hot_back;
    RadioGroup wet_hot_1;
    RadioGroup wet_hot_2;
    RadioGroup wet_hot_3;
    RadioGroup wet_hot_4;
    RadioGroup wet_hot_5;
    RadioGroup wet_hot_6;
    RadioGroup wet_hot_7;

    RadioButton score_one_wet_hot1;
    RadioButton score_one_wet_hot2;
    RadioButton score_one_wet_hot3;
    RadioButton score_one_wet_hot4;
    RadioButton score_one_wet_hot5;
    RadioButton score_one_wet_hot6;
    RadioButton score_one_wet_hot7;

    RadioButton score_two_wet_hot1;
    RadioButton score_two_wet_hot2;
    RadioButton score_two_wet_hot3;
    RadioButton score_two_wet_hot4;
    RadioButton score_two_wet_hot5;
    RadioButton score_two_wet_hot6;
    RadioButton score_two_wet_hot7;

    RadioButton score_three_wet_hot1;
    RadioButton score_three_wet_hot2;
    RadioButton score_three_wet_hot3;
    RadioButton score_three_wet_hot4;
    RadioButton score_three_wet_hot5;
    RadioButton score_three_wet_hot6;
    RadioButton score_three_wet_hot7;

    RadioButton score_four_wet_hot1;
    RadioButton score_four_wet_hot2;
    RadioButton score_four_wet_hot3;
    RadioButton score_four_wet_hot4;
    RadioButton score_four_wet_hot5;
    RadioButton score_four_wet_hot6;
    RadioButton score_four_wet_hot7;

    RadioButton score_five_wet_hot1;
    RadioButton score_five_wet_hot2;
    RadioButton score_five_wet_hot3;
    RadioButton score_five_wet_hot4;
    RadioButton score_five_wet_hot5;
    RadioButton score_five_wet_hot6;
    RadioButton score_five_wet_hot7;
    //总分数
    int score = 0;
    //单个问题的分数
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
        setContentView(R.layout.activity_wet_hot);
        wet_hot_confirm = findViewById(R.id.wet_hot_confirm);
        wet_hot_back = findViewById(R.id.wet_hot_back);
        wet_hot_confirm.setOnClickListener(this);
        wet_hot_back.setOnClickListener(this);
        wet_hot_1 = findViewById(R.id.wet_hot_1);
        wet_hot_2 = findViewById(R.id.wet_hot_2);
        wet_hot_3 = findViewById(R.id.wet_hot_3);
        wet_hot_4 = findViewById(R.id.wet_hot_4);
        wet_hot_5 = findViewById(R.id.wet_hot_5);
        wet_hot_6 = findViewById(R.id.wet_hot_6);
        wet_hot_7 = findViewById(R.id.wet_hot_7);

        score_one_wet_hot1 = findViewById(R.id.score_one_wet_hot1);
        score_one_wet_hot2 = findViewById(R.id.score_one_wet_hot2);
        score_one_wet_hot3 = findViewById(R.id.score_one_wet_hot3);
        score_one_wet_hot4 = findViewById(R.id.score_one_wet_hot4);
        score_one_wet_hot5 = findViewById(R.id.score_one_wet_hot5);
        score_one_wet_hot6 = findViewById(R.id.score_one_wet_hot6);
        score_one_wet_hot7 = findViewById(R.id.score_one_wet_hot7);

        score_two_wet_hot1 = findViewById(R.id.score_two_wet_hot1);
        score_two_wet_hot2 = findViewById(R.id.score_two_wet_hot2);
        score_two_wet_hot3 = findViewById(R.id.score_two_wet_hot3);
        score_two_wet_hot4 = findViewById(R.id.score_two_wet_hot4);
        score_two_wet_hot5 = findViewById(R.id.score_two_wet_hot5);
        score_two_wet_hot6 = findViewById(R.id.score_two_wet_hot6);
        score_two_wet_hot7 = findViewById(R.id.score_two_wet_hot7);

        score_three_wet_hot1 = findViewById(R.id.score_three_wet_hot1);
        score_three_wet_hot2 = findViewById(R.id.score_three_wet_hot2);
        score_three_wet_hot3 = findViewById(R.id.score_three_wet_hot3);
        score_three_wet_hot4 = findViewById(R.id.score_three_wet_hot4);
        score_three_wet_hot5 = findViewById(R.id.score_three_wet_hot5);
        score_three_wet_hot6 = findViewById(R.id.score_three_wet_hot6);
        score_three_wet_hot7 = findViewById(R.id.score_three_wet_hot7);

        score_four_wet_hot1 = findViewById(R.id.score_four_wet_hot1);
        score_four_wet_hot2 = findViewById(R.id.score_four_wet_hot2);
        score_four_wet_hot3 = findViewById(R.id.score_four_wet_hot3);
        score_four_wet_hot4 = findViewById(R.id.score_four_wet_hot4);
        score_four_wet_hot5 = findViewById(R.id.score_four_wet_hot5);
        score_four_wet_hot6 = findViewById(R.id.score_four_wet_hot6);
        score_four_wet_hot7 = findViewById(R.id.score_four_wet_hot7);

        score_five_wet_hot1 = findViewById(R.id.score_five_wet_hot1);
        score_five_wet_hot2 = findViewById(R.id.score_five_wet_hot2);
        score_five_wet_hot3 = findViewById(R.id.score_five_wet_hot3);
        score_five_wet_hot4 = findViewById(R.id.score_five_wet_hot4);
        score_five_wet_hot5 = findViewById(R.id.score_five_wet_hot5);
        score_five_wet_hot6 = findViewById(R.id.score_five_wet_hot6);
        score_five_wet_hot7 = findViewById(R.id.score_five_wet_hot7);


        //每次开始做问卷的时候将分数清零
        if(score != 0){
            score = 0;
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.wet_hot_confirm:
                //计算第一题分数
                for(int i = 0 ; i < wet_hot_1.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)wet_hot_1.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_1 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第一题分数是" + ":" + score_1);

                //计算第二题分数
                for(int i = 0 ; i < wet_hot_2.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)wet_hot_2.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_2 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_2);

                //计算第三题分数
                for(int i = 0 ; i < wet_hot_3.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)wet_hot_3.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_3 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第三题分数是" + ":" + score_3);

                //计算第四题分数
                for(int i = 0 ; i < wet_hot_4.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)wet_hot_4.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_4 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第四题分数是" + ":" + score_4);

                //计算第五题分数
                for(int i = 0 ; i < wet_hot_5.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)wet_hot_5.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_5 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第五题分数是" + ":" + score_5);

                //计算第六题分数
                for(int i = 0 ; i < wet_hot_6.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)wet_hot_6.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_6 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第六题分数是" + ":" + score_6);

                //计算第七题分数
                for(int i = 0 ; i < wet_hot_7.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)wet_hot_7.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_7 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第七分数是" + ":" + score_7);

                //计算总分数
                score  = score_1 + score_2 + score_3 + score_4 + score_5 + score_6 + score_7;
                Toast.makeText(wet_hotActivity.this, "你的得分是" + ":" + score + "分", Toast.LENGTH_LONG).show();

                break;
            case R.id.wet_hot_back:
                //将分数清零
                score = 0;
                finish();
                break;
                default:
                    break;
        }
    }
}
