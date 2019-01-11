package com.example.hasee.shiyuji.View;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hasee.shiyuji.R;

/**
 * 该类是点击背包中的食物后跳转到的详细介绍界面
 */
public class bag_foodActivity extends AppCompatActivity {
    public static final String FOOD_NAME = "food_name";

    public static final String FOOD_IMAGE_ID = "food_image_id";

    public static final String TYPE = "food";
    //上一个活动返回的食物名字
    String foodName;
    //上一个活动返回的食物图片路径id
    int foodId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag_food);

        Intent intent = getIntent();
        foodName = intent.getStringExtra(FOOD_NAME);
        foodId = intent.getIntExtra(FOOD_IMAGE_ID, 0);
        Toolbar toolbar = findViewById(R.id.toolbar);
        CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsing_toolbar);
        ImageView foodImageView = findViewById(R.id.food_image_view);
        TextView foodContextText = findViewById(R.id.food_content_text);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbar.setTitle(foodName);
        Glide.with(this).load(foodId).into(foodImageView);
        //设置详细内容介绍，以后实现
        foodContextText.setText("");


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
