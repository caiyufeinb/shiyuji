package com.example.hasee.shiyuji.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hasee.shiyuji.R;

/**
 * 该界面用来跳转到各个体质的问卷界面
 * 以及评分表界面
 * 拥有各个按钮
 */
public class ConstitutionActivity extends AppCompatActivity implements View.OnClickListener{
    Button peace;//平和质按钮
    Button lack_of_yang;//阳虚质按钮
    Button lack_of_yin;//阴虚质按钮
    Button phlegm_wet;//痰湿质按钮
    Button wet_hot;//湿热质按钮
    Button full_of_qi;//气郁质按钮
    Button lack_of_qi;//气虚质按钮
    Button blood;//血瘀质按钮
    Button special_quality;//特禀质按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constitution);
        //实例化控件阶段
        peace = findViewById(R.id.peace);
        lack_of_yang = findViewById(R.id.lack_of_yang);
        lack_of_yin = findViewById(R.id.lack_of_yin);
        phlegm_wet = findViewById(R.id.phlegm_wet);
        wet_hot = findViewById(R.id.wet_hot);
        full_of_qi = findViewById(R.id.full_of_qi);
        lack_of_qi = findViewById(R.id.lack_of_qi);
        blood = findViewById(R.id.blood);
        special_quality = findViewById(R.id.special_quality);
        peace.setOnClickListener(this);
        lack_of_yang.setOnClickListener(this);
        lack_of_yin.setOnClickListener(this);
        phlegm_wet.setOnClickListener(this);
        wet_hot.setOnClickListener(this);
        full_of_qi.setOnClickListener(this);
        lack_of_qi.setOnClickListener(this);
        blood.setOnClickListener(this);
        special_quality.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.peace:
                intent = new Intent(ConstitutionActivity.this, peaceActivity.class);
                startActivity(intent);
                break;
            case R.id.lack_of_yang:
                intent = new Intent(ConstitutionActivity.this, lack_yangActivity.class);
                startActivity(intent);
                break;
            case R.id.lack_of_yin:
                intent = new Intent(ConstitutionActivity.this, lack_yinActivity.class);
                startActivity(intent);
                break;
            case R.id.phlegm_wet:
                intent = new Intent(ConstitutionActivity.this, phlegm_wetActivity.class);
                startActivity(intent);
                break;
            case R.id.wet_hot:
                intent = new Intent(ConstitutionActivity.this, wet_hotActivity.class);
                startActivity(intent);
                break;
            case R.id.full_of_qi:
                intent = new Intent(ConstitutionActivity.this, full_of_qiActivity.class);
                startActivity(intent);
                break;
            case R.id.lack_of_qi:
                intent = new Intent(ConstitutionActivity.this, lack_of_qiActivity.class);
                startActivity(intent);
                break;
            case R.id.blood:
                intent = new Intent(ConstitutionActivity.this, bloodActivity.class);
                startActivity(intent);
                break;
            case R.id.special_quality:
                intent = new Intent(ConstitutionActivity.this, special_qualityActivity.class);
                startActivity(intent);
                break;

                default:
                    break;
        }
    }
}
