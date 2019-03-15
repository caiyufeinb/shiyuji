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
 * 该界面是气郁质体质问卷调查的界面，
 * 主要实现给用户显示问卷题目，统计分数的功能
 */
public class full_of_qiActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "full_of_qiActivity";
    Button full_of_qi_confirm;
    Button full_of_qi_back;
    //七个气郁质问题分组
    RadioGroup full_of_qi_1;
    RadioGroup full_of_qi_2;
    RadioGroup full_of_qi_3;
    RadioGroup full_of_qi_4;
    RadioGroup full_of_qi_5;
    RadioGroup full_of_qi_6;
    RadioGroup full_of_qi_7;
    //单选按钮声明
    RadioButton score_one_full_of_qi1;
    RadioButton score_one_full_of_qi2;
    RadioButton score_one_full_of_qi3;
    RadioButton score_one_full_of_qi4;
    RadioButton score_one_full_of_qi5;
    RadioButton score_one_full_of_qi6;
    RadioButton score_one_full_of_qi7;
    RadioButton score_two_full_of_qi1;
    RadioButton score_two_full_of_qi2;
    RadioButton score_two_full_of_qi3;
    RadioButton score_two_full_of_qi4;
    RadioButton score_two_full_of_qi5;
    RadioButton score_two_full_of_qi6;
    RadioButton score_two_full_of_qi7;
    RadioButton score_three_full_of_qi1;
    RadioButton score_three_full_of_qi2;
    RadioButton score_three_full_of_qi3;
    RadioButton score_three_full_of_qi4;
    RadioButton score_three_full_of_qi5;
    RadioButton score_three_full_of_qi6;
    RadioButton score_three_full_of_qi7;
    RadioButton score_four_full_of_qi1;
    RadioButton score_four_full_of_qi2;
    RadioButton score_four_full_of_qi3;
    RadioButton score_four_full_of_qi4;
    RadioButton score_four_full_of_qi5;
    RadioButton score_four_full_of_qi6;
    RadioButton score_four_full_of_qi7;
    RadioButton score_five_full_of_qi1;
    RadioButton score_five_full_of_qi2;
    RadioButton score_five_full_of_qi3;
    RadioButton score_five_full_of_qi4;
    RadioButton score_five_full_of_qi5;
    RadioButton score_five_full_of_qi6;
    RadioButton score_five_full_of_qi7;
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
        setContentView(R.layout.activity_full_of_qi);
        full_of_qi_confirm = findViewById(R.id.full_of_qi_confirm);
        full_of_qi_back = findViewById(R.id.full_of_qi_back);
        full_of_qi_confirm.setOnClickListener(this);
        full_of_qi_back.setOnClickListener(this);
        full_of_qi_1 = findViewById(R.id.full_of_qi_1);
        full_of_qi_2 = findViewById(R.id.full_of_qi_2);
        full_of_qi_3 = findViewById(R.id.full_of_qi_3);
        full_of_qi_4 = findViewById(R.id.full_of_qi_4);
        full_of_qi_5 = findViewById(R.id.full_of_qi_5);
        full_of_qi_6 = findViewById(R.id.full_of_qi_6);
        full_of_qi_7 = findViewById(R.id.full_of_qi_7);
        score_one_full_of_qi1 = findViewById(R.id.score_one_full_of_qi1);
        score_one_full_of_qi2 = findViewById(R.id.score_one_full_of_qi2);
        score_one_full_of_qi3 = findViewById(R.id.score_one_full_of_qi3);
        score_one_full_of_qi4 = findViewById(R.id.score_one_full_of_qi4);
        score_one_full_of_qi5 = findViewById(R.id.score_one_full_of_qi5);
        score_one_full_of_qi6 = findViewById(R.id.score_one_full_of_qi6);
        score_one_full_of_qi7 = findViewById(R.id.score_one_full_of_qi7);

        score_two_full_of_qi1 = findViewById(R.id.score_two_full_of_qi1);
        score_two_full_of_qi2 = findViewById(R.id.score_two_full_of_qi2);
        score_two_full_of_qi3 = findViewById(R.id.score_two_full_of_qi3);
        score_two_full_of_qi4 = findViewById(R.id.score_two_full_of_qi4);
        score_two_full_of_qi5 = findViewById(R.id.score_two_full_of_qi5);
        score_two_full_of_qi6 = findViewById(R.id.score_two_full_of_qi6);
        score_two_full_of_qi7 = findViewById(R.id.score_two_full_of_qi7);

        score_three_full_of_qi1 = findViewById(R.id.score_three_full_of_qi1);
        score_three_full_of_qi2 = findViewById(R.id.score_three_full_of_qi2);
        score_three_full_of_qi3 = findViewById(R.id.score_three_full_of_qi3);
        score_three_full_of_qi4 = findViewById(R.id.score_three_full_of_qi4);
        score_three_full_of_qi5 = findViewById(R.id.score_three_full_of_qi5);
        score_three_full_of_qi6 = findViewById(R.id.score_three_full_of_qi6);
        score_three_full_of_qi7 = findViewById(R.id.score_three_full_of_qi7);

        score_four_full_of_qi1 = findViewById(R.id.score_four_full_of_qi1);
        score_four_full_of_qi2 = findViewById(R.id.score_four_full_of_qi2);
        score_four_full_of_qi3 = findViewById(R.id.score_four_full_of_qi3);
        score_four_full_of_qi4 = findViewById(R.id.score_four_full_of_qi4);
        score_four_full_of_qi5 = findViewById(R.id.score_four_full_of_qi5);
        score_four_full_of_qi6 = findViewById(R.id.score_four_full_of_qi6);
        score_four_full_of_qi7 = findViewById(R.id.score_four_full_of_qi7);

        score_five_full_of_qi1 = findViewById(R.id.score_five_full_of_qi1);
        score_five_full_of_qi2 = findViewById(R.id.score_five_full_of_qi2);
        score_five_full_of_qi3 = findViewById(R.id.score_five_full_of_qi3);
        score_five_full_of_qi4 = findViewById(R.id.score_five_full_of_qi4);
        score_five_full_of_qi5 = findViewById(R.id.score_five_full_of_qi5);
        score_five_full_of_qi6 = findViewById(R.id.score_five_full_of_qi6);
        score_five_full_of_qi7 = findViewById(R.id.score_five_full_of_qi7);

        //每次开始做问卷的时候将分数清零
        if(score != 0 ){
            score = 0;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.full_of_qi_confirm:
                //计算第一题分数
                for(int i = 0 ; i < full_of_qi_1.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)full_of_qi_1.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_1 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第一题分数是" + ":" + score_1);

                //计算第二题分数
                for(int i = 0 ; i < full_of_qi_2.getChildCount() ; i++){
                RadioButton radioButton = (RadioButton)full_of_qi_2.getChildAt(i);
                if(radioButton.isChecked()){
                    score_2 = i + 1;
                }
            }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_2);

                //计算第三题分数
                for(int i = 0 ; i < full_of_qi_3.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)full_of_qi_3.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_3 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_3);

                //计算第四题分数
                for(int i = 0 ; i < full_of_qi_4.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)full_of_qi_4.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_4 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_4);

                //计算第五题分数
                for(int i = 0 ; i < full_of_qi_5.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)full_of_qi_5.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_5 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_5);

                //计算第六题分数
                for(int i = 0 ; i < full_of_qi_6.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)full_of_qi_6.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_6 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_6);

                //计算第七题分数
                for(int i = 0 ; i < full_of_qi_7.getChildCount() ; i++){
                    RadioButton radioButton = (RadioButton)full_of_qi_7.getChildAt(i);
                    if(radioButton.isChecked()){
                        score_7 = i + 1;
                    }
                }
                LogUtil.v(TAG, "第二题分数是" + ":" + score_7);

                //计算总分数
                score = score_1 + score_2 + score_3 + score_4 + score_5 + score_6 + score_7;
                Toast.makeText(full_of_qiActivity.this, "你的得分是" + ":" + score + "分", Toast.LENGTH_LONG).show();
                break;
            case R.id.full_of_qi_back:
                //将分数清零
                score = 0;
                finish();
                break;
                default:
                    break;
        }
    }
}
