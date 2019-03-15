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
public class special_qualityActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "special_qualityActivity";
    Button special_quality_confirm;
    Button special_quality_back;
    RadioGroup special_quality_1;
    RadioGroup special_quality_2;
    RadioGroup special_quality_3;
    RadioGroup special_quality_4;
    RadioGroup special_quality_5;
    RadioGroup special_quality_6;
    RadioGroup special_quality_7;

    RadioButton score_one_special_quality1;
    RadioButton score_one_special_quality2;
    RadioButton score_one_special_quality3;
    RadioButton score_one_special_quality4;
    RadioButton score_one_special_quality5;
    RadioButton score_one_special_quality6;
    RadioButton score_one_special_quality7;

    RadioButton score_two_special_quality1;
    RadioButton score_two_special_quality2;
    RadioButton score_two_special_quality3;
    RadioButton score_two_special_quality4;
    RadioButton score_two_special_quality5;
    RadioButton score_two_special_quality6;
    RadioButton score_two_special_quality7;

    RadioButton score_three_special_quality1;
    RadioButton score_three_special_quality2;
    RadioButton score_three_special_quality3;
    RadioButton score_three_special_quality4;
    RadioButton score_three_special_quality5;
    RadioButton score_three_special_quality6;
    RadioButton score_three_special_quality7;

    RadioButton score_four_special_quality1;
    RadioButton score_four_special_quality2;
    RadioButton score_four_special_quality3;
    RadioButton score_four_special_quality4;
    RadioButton score_four_special_quality5;
    RadioButton score_four_special_quality6;
    RadioButton score_four_special_quality7;

    RadioButton score_five_special_quality1;
    RadioButton score_five_special_quality2;
    RadioButton score_five_special_quality3;
    RadioButton score_five_special_quality4;
    RadioButton score_five_special_quality5;
    RadioButton score_five_special_quality6;
    RadioButton score_five_special_quality7;
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
        setContentView(R.layout.activity_special_quality);
        special_quality_confirm = findViewById(R.id.special_quality_confirm);
        special_quality_back = findViewById(R.id.special_quality_back);
        special_quality_confirm.setOnClickListener(this);
        special_quality_back.setOnClickListener(this);
        special_quality_1 = findViewById(R.id.special_quality_1);
        special_quality_2 = findViewById(R.id.special_quality_2);
        special_quality_3 = findViewById(R.id.special_quality_3);
        special_quality_4 = findViewById(R.id.special_quality_4);
        special_quality_5 = findViewById(R.id.special_quality_5);
        special_quality_6 = findViewById(R.id.special_quality_6);
        special_quality_7 = findViewById(R.id.special_quality_7);

        score_one_special_quality1 = findViewById(R.id.score_one_special_quality1);
        score_one_special_quality2 = findViewById(R.id.score_one_special_quality2);
        score_one_special_quality3 = findViewById(R.id.score_one_special_quality3);
        score_one_special_quality4 = findViewById(R.id.score_one_special_quality4);
        score_one_special_quality5 = findViewById(R.id.score_one_special_quality5);
        score_one_special_quality6 = findViewById(R.id.score_one_special_quality6);
        score_one_special_quality7 = findViewById(R.id.score_one_special_quality7);

        score_two_special_quality1 = findViewById(R.id.score_two_special_quality1);
        score_two_special_quality2 = findViewById(R.id.score_two_special_quality2);
        score_two_special_quality3 = findViewById(R.id.score_two_special_quality3);
        score_two_special_quality4 = findViewById(R.id.score_two_special_quality4);
        score_two_special_quality5 = findViewById(R.id.score_two_special_quality5);
        score_two_special_quality6 = findViewById(R.id.score_two_special_quality6);
        score_two_special_quality7 = findViewById(R.id.score_two_special_quality7);

        score_three_special_quality1 = findViewById(R.id.score_three_special_quality1);
        score_three_special_quality2 = findViewById(R.id.score_three_special_quality2);
        score_three_special_quality3 = findViewById(R.id.score_three_special_quality3);
        score_three_special_quality4 = findViewById(R.id.score_three_special_quality4);
        score_three_special_quality5 = findViewById(R.id.score_three_special_quality5);
        score_three_special_quality6 = findViewById(R.id.score_three_special_quality6);
        score_three_special_quality7 = findViewById(R.id.score_three_special_quality7);

        score_four_special_quality1 = findViewById(R.id.score_four_special_quality1);
        score_four_special_quality2 = findViewById(R.id.score_four_special_quality2);
        score_four_special_quality3 = findViewById(R.id.score_four_special_quality3);
        score_four_special_quality4 = findViewById(R.id.score_four_special_quality4);
        score_four_special_quality5 = findViewById(R.id.score_four_special_quality5);
        score_four_special_quality6 = findViewById(R.id.score_four_special_quality6);
        score_four_special_quality7 = findViewById(R.id.score_four_special_quality7);

        score_five_special_quality1 = findViewById(R.id.score_five_special_quality1);
        score_five_special_quality2 = findViewById(R.id.score_five_special_quality2);
        score_five_special_quality3 = findViewById(R.id.score_five_special_quality3);
        score_five_special_quality4 = findViewById(R.id.score_five_special_quality4);
        score_five_special_quality5 = findViewById(R.id.score_five_special_quality5);
        score_five_special_quality6 = findViewById(R.id.score_five_special_quality6);
        score_five_special_quality7 = findViewById(R.id.score_five_special_quality7);
        //每次开始做问卷的时候将分数清零
        if(score != 0){
            score = 0;
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.special_quality_confirm:
                //计算第一题分数
                for(int i = 0 ; i < special_quality_1.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)special_quality_1.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_1 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第一题分数是" + ":" + score_1);

                //计算第二题分数
                for(int i = 0 ; i < special_quality_2.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)special_quality_2.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_2 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_2);

                //计算第三题分数
                for(int i = 0 ; i < special_quality_3.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)special_quality_3.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_3 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第三题分数是" + ":" + score_3);

                //计算第四题分数
                for(int i = 0 ; i < special_quality_4.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)special_quality_4.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_4 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第四题分数是" + ":" + score_4);

                //计算第五题分数
                for(int i = 0 ; i < special_quality_5.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)special_quality_5.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_5 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第五题分数是" + ":" + score_5);

                //计算第六题分数
                for(int i = 0 ; i < special_quality_6.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)special_quality_6.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_6 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第六题分数是" + ":" + score_6);

                //计算第七题分数
                for(int i = 0 ; i < special_quality_7.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)special_quality_7.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_7 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第七题分数是" + ":" + score_7);

                //计算总分数
                score  = score_1 + score_2 + score_3 + score_4 + score_5 + score_6 + score_7;
                Toast.makeText(special_qualityActivity.this, "你的得分是" + ":" + score + "分", Toast.LENGTH_LONG).show();

                break;
            case R.id.special_quality_back:
                //将分数清零
                score = 0;
                finish();
                break;
        }
    }
}
