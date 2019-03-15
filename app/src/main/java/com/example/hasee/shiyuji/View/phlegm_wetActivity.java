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
 * 该界面是痰湿质体质问卷调查的界面，
 * 主要实现给用户显示问卷题目，统计分数的功能
 */
public class phlegm_wetActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "phlegm_wetActivity";
    Button phlegm_wet_confirm;
    Button phlegm_wet_back;
    RadioGroup phlegm_wet1;
    RadioGroup phlegm_wet2;
    RadioGroup phlegm_wet3;
    RadioGroup phlegm_wet4;
    RadioGroup phlegm_wet5;
    RadioGroup phlegm_wet6;
    RadioGroup phlegm_wet7;
    RadioGroup phlegm_wet8;

    RadioButton score_one_phlegm_wet1;
    RadioButton score_one_phlegm_wet2;
    RadioButton score_one_phlegm_wet3;
    RadioButton score_one_phlegm_wet4;
    RadioButton score_one_phlegm_wet5;
    RadioButton score_one_phlegm_wet6;
    RadioButton score_one_phlegm_wet7;
    RadioButton score_one_phlegm_wet8;

    RadioButton score_two_phlegm_wet1;
    RadioButton score_two_phlegm_wet2;
    RadioButton score_two_phlegm_wet3;
    RadioButton score_two_phlegm_wet4;
    RadioButton score_two_phlegm_wet5;
    RadioButton score_two_phlegm_wet6;
    RadioButton score_two_phlegm_wet7;
    RadioButton score_two_phlegm_wet8;

    RadioButton score_three_phlegm_wet1;
    RadioButton score_three_phlegm_wet2;
    RadioButton score_three_phlegm_wet3;
    RadioButton score_three_phlegm_wet4;
    RadioButton score_three_phlegm_wet5;
    RadioButton score_three_phlegm_wet6;
    RadioButton score_three_phlegm_wet7;
    RadioButton score_three_phlegm_wet8;

    RadioButton score_four_phlegm_wet1;
    RadioButton score_four_phlegm_wet2;
    RadioButton score_four_phlegm_wet3;
    RadioButton score_four_phlegm_wet4;
    RadioButton score_four_phlegm_wet5;
    RadioButton score_four_phlegm_wet6;
    RadioButton score_four_phlegm_wet7;
    RadioButton score_four_phlegm_wet8;

    RadioButton score_five_phlegm_wet1;
    RadioButton score_five_phlegm_wet2;
    RadioButton score_five_phlegm_wet3;
    RadioButton score_five_phlegm_wet4;
    RadioButton score_five_phlegm_wet5;
    RadioButton score_five_phlegm_wet6;
    RadioButton score_five_phlegm_wet7;
    RadioButton score_five_phlegm_wet8;
    //总分数
    int score = 0;
    //各个题目的分数
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
        setContentView(R.layout.activity_phlegm_wet);
        phlegm_wet_confirm = findViewById(R.id.phlegm_wet_confirm);
        phlegm_wet_back = findViewById(R.id.phlegm_wet_back);
        phlegm_wet_back.setOnClickListener(this);
        phlegm_wet_confirm.setOnClickListener(this);
        phlegm_wet1 = findViewById(R.id.phlegm_wet1);
        phlegm_wet2 = findViewById(R.id.phlegm_wet_2);
        phlegm_wet3 = findViewById(R.id.phlegm_wet_3);
        phlegm_wet4 = findViewById(R.id.phlegm_wet_4);
        phlegm_wet5 = findViewById(R.id.phlegm_wet_5);
        phlegm_wet6 = findViewById(R.id.phlegm_wet_6);
        phlegm_wet7 = findViewById(R.id.phlegm_wet_7);
        phlegm_wet8 = findViewById(R.id.phlegm_wet_8);

        score_one_phlegm_wet1 = findViewById(R.id.score_one_phlegm_wet1);
        score_one_phlegm_wet2 = findViewById(R.id.score_one_phlegm_wet2);
        score_one_phlegm_wet3 = findViewById(R.id.score_one_phlegm_wet3);
        score_one_phlegm_wet4 = findViewById(R.id.score_one_phlegm_wet4);
        score_one_phlegm_wet5 = findViewById(R.id.score_one_phlegm_wet5);
        score_one_phlegm_wet6 = findViewById(R.id.score_one_phlegm_wet6);
        score_one_phlegm_wet7 = findViewById(R.id.score_one_phlegm_wet7);
        score_one_phlegm_wet8 = findViewById(R.id.score_one_phlegm_wet8);

        score_two_phlegm_wet1 = findViewById(R.id.score_two_phlegm_wet1);
        score_two_phlegm_wet2 = findViewById(R.id.score_two_phlegm_wet2);
        score_two_phlegm_wet3 = findViewById(R.id.score_two_phlegm_wet3);
        score_two_phlegm_wet4 = findViewById(R.id.score_two_phlegm_wet4);
        score_two_phlegm_wet5 = findViewById(R.id.score_two_phlegm_wet5);
        score_two_phlegm_wet6 = findViewById(R.id.score_two_phlegm_wet6);
        score_two_phlegm_wet7 = findViewById(R.id.score_two_phlegm_wet7);
        score_two_phlegm_wet8 = findViewById(R.id.score_two_phlegm_wet8);

        score_three_phlegm_wet1 = findViewById(R.id.score_three_phlegm_wet1);
        score_three_phlegm_wet2 = findViewById(R.id.score_three_phlegm_wet2);
        score_three_phlegm_wet3 = findViewById(R.id.score_three_phlegm_wet3);
        score_three_phlegm_wet4 = findViewById(R.id.score_three_phlegm_wet4);
        score_three_phlegm_wet5 = findViewById(R.id.score_three_phlegm_wet5);
        score_three_phlegm_wet6 = findViewById(R.id.score_three_phlegm_wet6);
        score_three_phlegm_wet7 = findViewById(R.id.score_three_phlegm_wet7);
        score_three_phlegm_wet8 = findViewById(R.id.score_three_phlegm_wet8);

        score_four_phlegm_wet1 = findViewById(R.id.score_four_phlegm_wet1);
        score_four_phlegm_wet2 = findViewById(R.id.score_four_phlegm_wet2);
        score_four_phlegm_wet3 = findViewById(R.id.score_four_phlegm_wet3);
        score_four_phlegm_wet4 = findViewById(R.id.score_four_phlegm_wet4);
        score_four_phlegm_wet5 = findViewById(R.id.score_four_phlegm_wet5);
        score_four_phlegm_wet6 = findViewById(R.id.score_four_phlegm_wet6);
        score_four_phlegm_wet7 = findViewById(R.id.score_four_phlegm_wet7);
        score_four_phlegm_wet8 = findViewById(R.id.score_four_phlegm_wet8);

        score_five_phlegm_wet1 = findViewById(R.id.score_five_phlegm_wet1);
        score_five_phlegm_wet2 = findViewById(R.id.score_five_phlegm_wet2);
        score_five_phlegm_wet3 = findViewById(R.id.score_five_phlegm_wet3);
        score_five_phlegm_wet4 = findViewById(R.id.score_five_phlegm_wet4);
        score_five_phlegm_wet5 = findViewById(R.id.score_five_phlegm_wet5);
        score_five_phlegm_wet6 = findViewById(R.id.score_five_phlegm_wet6);
        score_five_phlegm_wet7 = findViewById(R.id.score_five_phlegm_wet7);
        score_five_phlegm_wet8 = findViewById(R.id.score_five_phlegm_wet8);

        //每次开始做问卷的时候将分数清零
        if(score != 0){
            score = 0;
        }



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.phlegm_wet_confirm:
                //计算第一题分数
                for(int i = 0 ; i < phlegm_wet1.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)phlegm_wet1.getChildAt(i);
                        if(radioButton.isChecked()){
                        score_1 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第一题分数是" + ":" + score_1);

                //计算第二题分数
                for(int i = 0 ; i < phlegm_wet2.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)phlegm_wet2.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_2 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_2);

                //计算第三题分数
                for(int i = 0 ; i < phlegm_wet3.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)phlegm_wet3.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_3 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第三题分数是" + ":" + score_3);

                //计算第四题分数
                for(int i = 0 ; i < phlegm_wet4.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)phlegm_wet4.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_4 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第四题分数是" + ":" + score_4);

                //计算第五题分数
                for(int i = 0 ; i < phlegm_wet5.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)phlegm_wet5.getChildAt(i);
                        if(radioButton.isChecked()){
                        score_5 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第五题分数是" + ":" + score_5);

                //计算第六题分数
                for(int i = 0 ; i < phlegm_wet6.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)phlegm_wet6.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_6 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第六题分数是" + ":" + score_6);

                //计算第七题分数
                for(int i = 0 ; i < phlegm_wet7.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)phlegm_wet7.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_7 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第七题分数是" + ":" + score_7);

                //计算第八题分数
                for(int i = 0 ; i < phlegm_wet8.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)phlegm_wet8.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_8 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第八题分数是" + ":" + score_8);

                //计算总分数
                score  = score_1 + score_2 + score_3 + score_4 + score_5 + score_6 + score_7 + score_8;
                Toast.makeText(phlegm_wetActivity.this, "你的得分是" + ":" + score + "分", Toast.LENGTH_LONG).show();


                break;
            case R.id.phlegm_wet_back:
                //将分数清零
                score = 0;
                finish();
                break;
                default:
                    break;
        }
    }
}
