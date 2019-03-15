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
public class lack_yinActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "lack_yinActivity";
    Button lack_yin_confirm;
    Button lack_yin_back;
    //气虚问题分组声明
    RadioGroup  lack_of_yin1;
    RadioGroup  lack_of_yin2;
    RadioGroup  lack_of_yin3;
    RadioGroup  lack_of_yin4;
    RadioGroup  lack_of_yin5;
    RadioGroup  lack_of_yin6;
    RadioGroup  lack_of_yin7;
    RadioGroup  lack_of_yin8;
    //问题按钮声明
    RadioButton score_one_lack_of_yin1;
    RadioButton score_one_lack_of_yin2;
    RadioButton score_one_lack_of_yin3;
    RadioButton score_one_lack_of_yin4;
    RadioButton score_one_lack_of_yin5;
    RadioButton score_one_lack_of_yin6;
    RadioButton score_one_lack_of_yin7;
    RadioButton score_one_lack_of_yin8;

    RadioButton score_two_lack_of_yin1;
    RadioButton score_two_lack_of_yin2;
    RadioButton score_two_lack_of_yin3;
    RadioButton score_two_lack_of_yin4;
    RadioButton score_two_lack_of_yin5;
    RadioButton score_two_lack_of_yin6;
    RadioButton score_two_lack_of_yin7;
    RadioButton score_two_lack_of_yin8;

    RadioButton score_three_lack_of_yin1;
    RadioButton score_three_lack_of_yin2;
    RadioButton score_three_lack_of_yin3;
    RadioButton score_three_lack_of_yin4;
    RadioButton score_three_lack_of_yin5;
    RadioButton score_three_lack_of_yin6;
    RadioButton score_three_lack_of_yin7;
    RadioButton score_three_lack_of_yin8;

    RadioButton score_four_lack_of_yin1;
    RadioButton score_four_lack_of_yin2;
    RadioButton score_four_lack_of_yin3;
    RadioButton score_four_lack_of_yin4;
    RadioButton score_four_lack_of_yin5;
    RadioButton score_four_lack_of_yin6;
    RadioButton score_four_lack_of_yin7;
    RadioButton score_four_lack_of_yin8;

    RadioButton score_five_lack_of_yin1;
    RadioButton score_five_lack_of_yin2;
    RadioButton score_five_lack_of_yin3;
    RadioButton score_five_lack_of_yin4;
    RadioButton score_five_lack_of_yin5;
    RadioButton score_five_lack_of_yin6;
    RadioButton score_five_lack_of_yin7;
    RadioButton score_five_lack_of_yin8;

    //计算总分数
    int score = 0;
    //计算每个题目的分数
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
        setContentView(R.layout.activity_lack_yin);
        lack_yin_confirm = findViewById(R.id.lack_yin_confirm);
        lack_yin_back =  findViewById(R.id.lack_yin_back);
        lack_yin_confirm.setOnClickListener(this);
        lack_yin_back.setOnClickListener(this);
        lack_of_yin1 = findViewById(R.id.lack_of_yin1);
        lack_of_yin2 = findViewById(R.id.lack_of_yin2);
        lack_of_yin3 = findViewById(R.id.lack_of_yin3);
        lack_of_yin4 = findViewById(R.id.lack_of_yin4);
        lack_of_yin5 = findViewById(R.id.lack_of_yin5);
        lack_of_yin6 = findViewById(R.id.lack_of_yin6);
        lack_of_yin7 = findViewById(R.id.lack_of_yin7);
        lack_of_yin8 = findViewById(R.id.lack_of_yin8);

        score_one_lack_of_yin1 = findViewById(R.id.score_one_lack_of_yin1);
        score_one_lack_of_yin2 = findViewById(R.id.score_one_lack_of_yin2);
        score_one_lack_of_yin3 = findViewById(R.id.score_one_lack_of_yin3);
        score_one_lack_of_yin4 = findViewById(R.id.score_one_lack_of_yin4);
        score_one_lack_of_yin5 = findViewById(R.id.score_one_lack_of_yin5);
        score_one_lack_of_yin6 = findViewById(R.id.score_one_lack_of_yin6);
        score_one_lack_of_yin7 = findViewById(R.id.score_one_lack_of_yin7);
        score_one_lack_of_yin8 = findViewById(R.id.score_one_lack_of_yin8);

        score_two_lack_of_yin1 = findViewById(R.id.score_two_lack_of_yin1);
        score_two_lack_of_yin2 = findViewById(R.id.score_two_lack_of_yin2);
        score_two_lack_of_yin3 = findViewById(R.id.score_two_lack_of_yin3);
        score_two_lack_of_yin4 = findViewById(R.id.score_two_lack_of_yin4);
        score_two_lack_of_yin5 = findViewById(R.id.score_two_lack_of_yin5);
        score_two_lack_of_yin6 = findViewById(R.id.score_two_lack_of_yin6);
        score_two_lack_of_yin7 = findViewById(R.id.score_two_lack_of_yin7);
        score_two_lack_of_yin8 = findViewById(R.id.score_two_lack_of_yin8);

        score_three_lack_of_yin1 = findViewById(R.id.score_three_lack_of_yin1);
        score_three_lack_of_yin2 = findViewById(R.id.score_three_lack_of_yin2);
        score_three_lack_of_yin3 = findViewById(R.id.score_three_lack_of_yin3);
        score_three_lack_of_yin4 = findViewById(R.id.score_three_lack_of_yin4);
        score_three_lack_of_yin5 = findViewById(R.id.score_three_lack_of_yin5);
        score_three_lack_of_yin6 = findViewById(R.id.score_three_lack_of_yin6);
        score_three_lack_of_yin7 = findViewById(R.id.score_three_lack_of_yin7);
        score_three_lack_of_yin8 = findViewById(R.id.score_three_lack_of_yin8);

        score_four_lack_of_yin1 = findViewById(R.id.score_four_lack_of_yin1);
        score_four_lack_of_yin2 = findViewById(R.id.score_four_lack_of_yin2);
        score_four_lack_of_yin3 = findViewById(R.id.score_four_lack_of_yin3);
        score_four_lack_of_yin4 = findViewById(R.id.score_four_lack_of_yin4);
        score_four_lack_of_yin5 = findViewById(R.id.score_four_lack_of_yin5);
        score_four_lack_of_yin6 = findViewById(R.id.score_four_lack_of_yin6);
        score_four_lack_of_yin7 = findViewById(R.id.score_four_lack_of_yin7);
        score_four_lack_of_yin8 = findViewById(R.id.score_four_lack_of_yin8);

        score_five_lack_of_yin1 = findViewById(R.id.score_five_lack_of_yin1);
        score_five_lack_of_yin2 = findViewById(R.id.score_five_lack_of_yin2);
        score_five_lack_of_yin3 = findViewById(R.id.score_five_lack_of_yin3);
        score_five_lack_of_yin4 = findViewById(R.id.score_five_lack_of_yin4);
        score_five_lack_of_yin5 = findViewById(R.id.score_five_lack_of_yin5);
        score_five_lack_of_yin6 = findViewById(R.id.score_five_lack_of_yin6);
        score_five_lack_of_yin7 = findViewById(R.id.score_five_lack_of_yin7);
        score_five_lack_of_yin8 = findViewById(R.id.score_five_lack_of_yin8);
        //每次开始做问卷的时候将分数清零
        if(score != 0){
            score = 0;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lack_yin_confirm:
                //计算第一题分数
                for(int i = 0 ; i < lack_of_yin1.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yin1.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_1 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第一题分数是" + ":" + score_1);

                //计算第二题分数
                for(int i = 0 ; i < lack_of_yin2.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yin2.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_2 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_2);

                //计算第三题分数
                for(int i = 0 ; i < lack_of_yin3.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yin3.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_3 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第三题分数是" + ":" + score_3);

                //计算第四题分数
                for(int i = 0 ; i < lack_of_yin4.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yin4.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_4 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第四题分数是" + ":" + score_4);

                //计算第五题分数
                for(int i = 0 ; i < lack_of_yin5.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yin5.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_5 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第一题分数是" + ":" + score_5);

                //计算第六题分数
                for(int i = 0 ; i < lack_of_yin6.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yin6.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_1 = 6 + 1;
                    }
                }
                LogUtil.v(TAG, "第六题分数是" + ":" + score_6);

                //计算第七题分数
                for(int i = 0 ; i < lack_of_yin7.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yin7.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_7 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第一题分数是" + ":" + score_7);

                //计算第八题分数
                for(int i = 0 ; i < lack_of_yin8.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)lack_of_yin8.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_8 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第一题分数是" + ":" + score_8);

                //计算总分数
                score = score_1 + score_2 + score_3 + score_4 + score_5 + score_6 + score_7 + score_8;
                Toast.makeText(lack_yinActivity.this, "你的得分是" + ":" + score + "分", Toast.LENGTH_LONG).show();
                break;
            case R.id.lack_yin_back:
                //分数清零
                score = 0;
                finish();
                break;
                default:
                    break;
        }
    }
}
