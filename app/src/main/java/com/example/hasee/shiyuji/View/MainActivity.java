package com.example.hasee.shiyuji.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.hasee.shiyuji.DB.Cold;
import com.example.hasee.shiyuji.DB.Cool;
import com.example.hasee.shiyuji.DB.GameUser;
import com.example.hasee.shiyuji.DB.Normal;
import com.example.hasee.shiyuji.DB.Warm;
import com.example.hasee.shiyuji.Log.LogUtil;
import com.example.hasee.shiyuji.R;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.UpdateListener;


/**
 * 该界面是选择角色的界面
 * 该界面显示用户的金币，角色介绍
 * 背包（显示用户拥有的卡牌）
 * 抽奖功能（消耗金币来实现抽卡的功能）
 * 签到功能（每天签到给予一定数量的金币）
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton button1 = null; //凤凰图片按钮
    ImageButton button2 = null; //青龙图片按钮
    ImageButton button3 = null; //白虎图片按钮
    ImageButton button4 = null; //玄武图片按钮
    TextView money = null;    //金币显示文本框
    Button signUp = null;   //签到领金币按钮
    Button bag = null;      //背包按钮
    Button luck = null;     //抽卡按钮
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化各个控件
        button1 = findViewById(R.id.btn_1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.btn_2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.btn_3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.btn_4);
        button4.setOnClickListener(this);
        money = findViewById(R.id.money);
        signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(this);
        bag = findViewById(R.id.bag);
        bag.setOnClickListener(this);
        luck = findViewById(R.id.choujiang);
        luck.setOnClickListener(this);
        //查询用户当前金币数
        GameUser user = BmobUser.getCurrentUser(GameUser.class);
        money.setText(String.valueOf(user.getMoney()));
        /*测试代码，测试能否添加食物和角色的多对多关联
        表示食物被哪些用户拥有
        结果:测试结果成功
        Cold cold = new Cold();
        cold.setObjectId("43YdMMMe");
        //创建BmobRelation对象
        BmobRelation relation = new BmobRelation();
        //将当前用户添加到食物表中的relation字段值中，表明当前食物的主人是某个用户
        relation.add(user);
        //多对多关联指向cold的relation字段
        cold.setRelation(relation);
        cold.update(new UpdateListener() {
            @Override
            public void done(BmobException e) {
                if(e == null){
                    LogUtil.v(TAG, "添加关联成功");
                }else{
                    LogUtil.v(TAG, "添加关联失败" + e.getMessage());
                }
            }
        });
        */
        /*
        测试代码，添加人物拥有的食物
        表示该用户拥有哪些食物
        添加结果，添加成功
        Normal normal = new Normal();
        normal.setObjectId("7d1148f29a");
        BmobRelation relation = new BmobRelation();
        relation.add(normal);
        user.setHaving(relation);
        user.update(new UpdateListener() {
            @Override
            public void done(BmobException e) {
                if(e == null){
                    LogUtil.v(TAG, "添加关联成功");
                }else{
                    LogUtil.v(TAG, "添加关联失败" + e.getMessage());
                }
            }
        });
        /*
        测试代码
        测试是否能在数据库中添加食物的图片id来实现显示图片的效果
        测试结果：成功*/
        Normal baicai = new Normal();
        baicai.setImageId(R.drawable.cabbage);
        baicai.update("7d1148f29a", new UpdateListener() {
            @Override
            public void done(BmobException e) {
                if(e == null){
                    LogUtil.v(TAG, "添加白菜图片id成功");
                }else{
                    LogUtil.v(TAG, "添加白菜图片id失败" + e.getMessage());
                }
            }
        });

        /*
        添加食物图片代码，把食物对应的卡通图片放到数据库里
         */
//        Cool daikon = new Cool();
//        daikon.setImageId(R.drawable.daikon);
//        daikon.update("1DpL333D", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加白萝卜图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加白萝卜图片id失败" + e.getMessage());
//                }
//            }
//        });
//        Normal cabbage = new Normal();
//        cabbage.setImageId(R.drawable.cabbage1);
//        cabbage.update("OALs666d", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加包心菜图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加包心菜图片id失败" + e.getMessage());
//                }
//            }
//        });
//        Cool spinach = new Cool();
//        spinach.setImageId(R.drawable.spinach);
//        spinach.update("a24d6954c2", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加菠菜图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加菠菜菜图片id失败" + e.getMessage());
//                }
//            }
//        });
//        Cool orange = new Cool();
//        orange.setImageId(R.drawable.orange);
//        orange.update("AIVo444D", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加橙子图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加橙子图片id失败" + e.getMessage());
//                }
//            }
//        });
//        Warm scallion = new Warm();
//        scallion.setImageId(R.drawable.scallion);
//        scallion.update("3DvhBBBm", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加葱图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加葱图片id失败" + e.getMessage());
//                }
//            }
//        });
//        Warm garlic = new Warm();
//        garlic.setImageId(R.drawable.garlic);
//        garlic.update("Z1WsMMMU", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加大蒜图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加大蒜图片id失败" + e.getMessage());
//                }
//            }
//        });
//        Cool waxGourd = new Cool();
//        waxGourd.setImageId(R.drawable.waxgourd);
//        waxGourd.update("G4YQ111A", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加冬瓜图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加冬瓜图片id失败" + e.getMessage());
//                }
//            }
//        });
//        Cold tomato = new Cold();
//        tomato.setImageId(R.drawable.tomato);
//        tomato.update("QsCNZZZv", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加番茄图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加番茄图片id失败" + e.getMessage());
//                }
//            }
//        });
//        Normal sweetPotato = new Normal();
//        sweetPotato.setImageId(R.drawable.sweetpotato);
//        sweetPotato.update("2I0m3337", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加甘薯图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加甘薯图片id失败" + e.getMessage());
//                }
//            }
//        });
//        Normal olive = new Normal();
//        olive.setImageId(R.drawable.olive);
//        olive.update("n2lJG33G", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加橄榄图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加橄榄图片id失败" + e.getMessage());
//                }
//            }
//        });
//        Normal carrot = new Normal();
//        carrot.setImageId(R.drawable.carrot);
//        carrot.update("4qjQBBBF", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加胡萝卜图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加胡萝卜图片id失败" + e.getMessage());
//                }
//            }
//        });
//        Cold cucumber = new Cold();
//        cucumber.setImageId(R.drawable.cucumber);
//        cucumber.update("yduv000Q", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加黄瓜图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加黄瓜图片id失败" + e.getMessage());
//                }
//            }
//        });
//        Warm chineseChive = new Warm();
//        chineseChive.setImageId(R.drawable.chinesechive);
//        chineseChive.update("JulZ333G", new UpdateListener() {
//            @Override
//            public void done(BmobException e) {
//                if(e == null){
//                    LogUtil.v(TAG, "添加黄瓜图片id成功");
//                }else{
//                    LogUtil.v(TAG, "添加黄瓜图片id失败" + e.getMessage());
//                }
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_1:
                intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_2:
                intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_3:
                intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_4:
                intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
                break;
            case R.id.bag:
                intent = new Intent(MainActivity.this, BagActivity.class);
                startActivity(intent);
            case R.id.choujiang:
                intent = new Intent(MainActivity.this, LuckyActivity.class);
                startActivity(intent);
            default:
                break;
        }
    }
}
