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
public class lack_yangActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "lack_yangActivity";
    //两个按钮实现统计分数和返回功能
    Button lack_yang_confirm;
    Button lack_yang_back;
    //七个阳虚质问题分组
    RadioGroup lack_of_yang1;
    RadioGroup lack_of_yang2;
    RadioGroup lack_of_yang3;
    RadioGroup lack_of_yang4;
    RadioGroup lack_of_yang5;
    RadioGroup lack_of_yang6;
    RadioGroup lack_of_yang7;
    //单选按钮声明
    RadioButton score_one_lack_of_yang1;
    RadioButton score_one_lack_of_yang2;
    RadioButton score_one_lack_of_yang3;
    RadioButton score_one_lack_of_yang4;
    RadioButton score_one_lack_of_yang5;
    RadioButton score_one_lack_of_yang6;
    RadioButton score_one_lack_of_yang7;

    RadioButton score_two_lack_of_yang1;
    RadioButton score_two_lack_of_yang2;
    RadioButton score_two_lack_of_yang3;
    RadioButton score_two_lack_of_yang4;
    RadioButton score_two_lack_of_yang5;
    RadioButton score_two_lack_of_yang6;
    RadioButton score_two_lack_of_yang7;

    RadioButton score_three_lack_of_yang1;
    RadioButton score_three_lack_of_yang2;
    RadioButton score_three_lack_of_yang3;
    RadioButton score_three_lack_of_yang4;
    RadioButton score_three_lack_of_yang5;
    RadioButton score_three_lack_of_yang6;
    RadioButton score_three_lack_of_yang7;

    RadioButton score_four_lack_of_yang1;
    RadioButton score_four_lack_of_yang2;
    RadioButton score_four_lack_of_yang3;
    RadioButton score_four_lack_of_yang4;
    RadioButton score_four_lack_of_yang5;
    RadioButton score_four_lack_of_yang6;
    RadioButton score_four_lack_of_yang7;

    RadioButton score_five_lack_of_yang1;
    RadioButton score_five_lack_of_yang2;
    RadioButton score_five_lack_of_yang3;
    RadioButton score_five_lack_of_yang4;
    RadioButton score_five_lack_of_yang5;
    RadioButton score_five_lack_of_yang6;
    RadioButton score_five_lack_of_yang7;
    //计算总分数
    int score = 0;
    //计算各个题目的分数
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
        setContentView(R.layout.activity_lack_yang);
        lack_yang_back = findViewById(R.id.lack_yang_back);
        lack_yang_confirm = findViewById(R.id.lack_yang_confirm);
        lack_yang_confirm.setOnClickListener(this);
        lack_yang_back.setOnClickListener(this);
        //实例化RadioGroup控件
        lack_of_yang1 = findViewById(R.id.lack_of_yang1);
        lack_of_yang2 = findViewById(R.id.lack_of_yang2);
        lack_of_yang3 = findViewById(R.id.lack_of_yang3);
        lack_of_yang4 = findViewById(R.id.lack_of_yang4);
        lack_of_yang5 = findViewById(R.id.lack_of_yang5);
        lack_of_yang6 = findViewById(R.id.lack_of_yang6);
        lack_of_yang7 = findViewById(R.id.lack_of_yang7);
        //实例化RadioButton按钮
        score_one_lack_of_yang1 = findViewById(R.id.score_one_lack_of_yang1);
        score_one_lack_of_yang2 = findViewById(R.id.score_one_lack_of_yang2);
        score_one_lack_of_yang3 = findViewById(R.id.score_one_lack_of_yang3);
        score_one_lack_of_yang4 = findViewById(R.id.score_one_lack_of_yang4);
        score_one_lack_of_yang5 = findViewById(R.id.score_one_lack_of_yang5);
        score_one_lack_of_yang6 = findViewById(R.id.score_one_lack_of_yang6);
        score_one_lack_of_yang7 = findViewById(R.id.score_one_lack_of_yang7);

        score_two_lack_of_yang1 = findViewById(R.id.score_two_lack_of_yang1);
        score_two_lack_of_yang2 = findViewById(R.id.score_two_lack_of_yang2);
        score_two_lack_of_yang3 = findViewById(R.id.score_two_lack_of_yang3);
        score_two_lack_of_yang4 = findViewById(R.id.score_two_lack_of_yang4);
        score_two_lack_of_yang5 = findViewById(R.id.score_two_lack_of_yang5);
        score_two_lack_of_yang6 = findViewById(R.id.score_two_lack_of_yang6);
        score_two_lack_of_yang7 = findViewById(R.id.score_two_lack_of_yang7);

        score_three_lack_of_yang1 = findViewById(R.id.score_three_lack_of_yang1);
        score_three_lack_of_yang2 = findViewById(R.id.score_three_lack_of_yang2);
        score_three_lack_of_yang3 = findViewById(R.id.score_three_lack_of_yang3);
        score_three_lack_of_yang4 = findViewById(R.id.score_three_lack_of_yang4);
        score_three_lack_of_yang5 = findViewById(R.id.score_three_lack_of_yang5);
        score_three_lack_of_yang6 = findViewById(R.id.score_three_lack_of_yang6);
        score_three_lack_of_yang7 = findViewById(R.id.score_three_lack_of_yang7);

        score_four_lack_of_yang1 = findViewById(R.id.score_four_lack_of_yang1);
        score_four_lack_of_yang2 = findViewById(R.id.score_four_lack_of_yang2);
        score_four_lack_of_yang3 = findViewById(R.id.score_four_lack_of_yang3);
        score_four_lack_of_yang4 = findViewById(R.id.score_four_lack_of_yang4);
        score_four_lack_of_yang5 = findViewById(R.id.score_four_lack_of_yang5);
        score_four_lack_of_yang6 = findViewById(R.id.score_four_lack_of_yang6);
        score_four_lack_of_yang7 = findViewById(R.id.score_four_lack_of_yang7);

        score_five_lack_of_yang1 = findViewById(R.id.score_five_lack_of_yang1);
        score_five_lack_of_yang2 = findViewById(R.id.score_five_lack_of_yang2);
        score_five_lack_of_yang3 = findViewById(R.id.score_five_lack_of_yang3);
        score_five_lack_of_yang4 = findViewById(R.id.score_five_lack_of_yang4);
        score_five_lack_of_yang5 = findViewById(R.id.score_five_lack_of_yang5);
        score_five_lack_of_yang6 = findViewById(R.id.score_five_lack_of_yang6);
        score_five_lack_of_yang7 = findViewById(R.id.score_five_lack_of_yang7);
        //每次开始做问卷的时候将分数清零
        if(score != 0){
            score = 0;
        }


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lack_yang_confirm:
                //计算第一题分数
                for(int i = 0 ; i < lack_of_yang1.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yang1.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_1 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第一题分数是" + ":" + score_1);

                //计算第二题分数
                for(int i = 0 ; i < lack_of_yang2.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yang2.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_2 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_2);

                //计算第三题分数
                for(int i = 0 ; i < lack_of_yang3.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yang3.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_3 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第一题分数是" + ":" + score_3);

                //计算第四题分数
                for(int i = 0 ; i < lack_of_yang4.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yang4.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_4 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第四题分数是" + ":" + score_4);

                //计算第五题分数
                for(int i = 0 ; i < lack_of_yang5.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yang5.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_5 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第五题分数是" + ":" + score_5);

                //计算第六题分数
                for(int i = 0 ; i < lack_of_yang6.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yang6.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_6 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第六题分数是" + ":" + score_6);

                //计算第七题分数
                for(int i = 0 ; i < lack_of_yang7.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yang7.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_7 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第七题分数是" + ":" + score_7);
                Toast.makeText(lack_yangActivity.this, "你的得分是" + ":" + score + "分", Toast.LENGTH_LONG).show();
                break;
            case R.id.lack_yang_back:
                //分数清零
                score = 0;
                finish();
                break;
                default:
                    break;
        }
    }
}
