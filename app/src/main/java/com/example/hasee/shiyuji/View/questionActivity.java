package com.example.hasee.shiyuji.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.hasee.shiyuji.Adapter.quesColdAdapter;
import com.example.hasee.shiyuji.Adapter.quesCoolAdapter;
import com.example.hasee.shiyuji.Adapter.quesHotAdapter;
import com.example.hasee.shiyuji.Adapter.quesNormalAdapter;
import com.example.hasee.shiyuji.Adapter.quesWarmAdapter;
import com.example.hasee.shiyuji.DB.Cold;
import com.example.hasee.shiyuji.DB.Cool;
import com.example.hasee.shiyuji.DB.GameUser;
import com.example.hasee.shiyuji.DB.Hot;
import com.example.hasee.shiyuji.DB.Normal;
import com.example.hasee.shiyuji.DB.Warm;
import com.example.hasee.shiyuji.R;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobPointer;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

/**
 * 闯关问题界面
 * 点击第XX关之后进入该界面，得到对应的问题描述
 * 然后用户点击下面自己拥有的食物卡片
 * 根据选择的卡片评判星级
 * 根据对应的星级跳转到结果界面
 */
public class questionActivity extends AppCompatActivity implements View.OnClickListener{
    /*
    声明控件阶段
     */
    private RecyclerView recyclerView;
    //分类按钮
    Button coldBtn;
    Button coolBtn;
    Button hotBtn;
    Button normalBtn;
    Button warmBtn;
    //返回按钮
    Button back;
    //数据库获取到的拥有的食物列表
    private List<Cold> coldList = new ArrayList<>();
    private List<Cool> coolList = new ArrayList<>();
    private List<Hot> hotList = new ArrayList<>();
    private List<Normal> normalList = new ArrayList<>();
    private List<Warm> warmList = new ArrayList<>();
    //五种食物的适配器
    private quesColdAdapter adapterCold;
    private quesCoolAdapter adapterCool;
    private quesHotAdapter adapterHot;
    private quesWarmAdapter adapterWarm;
    private quesNormalAdapter adapterNormal;
    /*
    缺少功能：给各个食物添加图片id，等图片到后再添加数据
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        //获取控件实例阶段
        recyclerView = findViewById(R.id.food_choice);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 4);
        recyclerView.setLayoutManager(layoutManager);
        coldBtn = findViewById(R.id.ques_cold);
        coolBtn = findViewById(R.id.ques_cool);
        hotBtn = findViewById(R.id.ques_hot);
        warmBtn = findViewById(R.id.ques_warm);
        normalBtn = findViewById(R.id.ques_normal);
        back = findViewById(R.id.ques_back);
        coldBtn.setOnClickListener(this);
        coolBtn.setOnClickListener(this);
        hotBtn.setOnClickListener(this);
        warmBtn.setOnClickListener(this);
        normalBtn.setOnClickListener(this);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //获取当前用户
        GameUser user = BmobUser.getCurrentUser(GameUser.class);
        switch (v.getId()) {
            case R.id.ques_cold:
                //查询当前用户拥有的寒性食物,查询的是寒性食物表
                BmobQuery<Cold> queryCold = new BmobQuery<>();
                queryCold.addWhereRelatedTo("having", new BmobPointer(user));
                queryCold.findObjects(new FindListener<Cold>() {
                    @Override
                    public void done(List<Cold> list, BmobException e) {
                        //获取到食物列表，用到适配器中，至此，设置好图片id后，理论上应该能够显示用户拥有的寒性食物
                        coldList = list;
                        adapterCold = new quesColdAdapter(coldList);
                        recyclerView.setAdapter(adapterCold);
                    }
                });
                break;
            case R.id.ques_cool:
                BmobQuery<Cool> queryCool = new BmobQuery<>();
                queryCool.addWhereRelatedTo("having", new BmobPointer(user));
                queryCool.findObjects(new FindListener<Cool>() {
                    @Override
                    public void done(List<Cool> list, BmobException e) {
                        //获取到食物列表，用到适配器中，至此，设置好图片id后，理论上应该能够显示用户拥有的该类食物
                        coolList = list;
                        adapterCool = new quesCoolAdapter(coolList);
                        recyclerView.setAdapter(adapterCool);
                    }
                });
                break;
            case R.id.ques_hot:
                BmobQuery<Hot> queryHot = new BmobQuery<>();
                queryHot.addWhereRelatedTo("having", new BmobPointer(user));
                queryHot.findObjects(new FindListener<Hot>() {
                    @Override
                    public void done(List<Hot> list, BmobException e) {
                        //获取到食物列表，用到适配器中，至此，设置好图片id后，理论上应该能够显示用户拥有的该类食物
                        hotList = list;
                        adapterHot = new quesHotAdapter(hotList);
                        recyclerView.setAdapter(adapterHot);
                    }
                });
                break;
            case R.id.ques_warm:
                BmobQuery<Warm> queryWarm = new BmobQuery<>();
                queryWarm.addWhereRelatedTo("having", new BmobPointer(user));
                queryWarm.findObjects(new FindListener<Warm>() {
                    @Override
                    public void done(List<Warm> list, BmobException e) {
                        //获取到食物列表，用到适配器中，至此，设置好图片id后，理论上应该能够显示用户拥有的该类食物
                        warmList = list;
                        adapterWarm = new quesWarmAdapter(warmList);
                        recyclerView.setAdapter(adapterWarm);
                    }
                });
                break;
            case R.id.ques_normal:
                BmobQuery<Normal> queryNormal = new BmobQuery<>();
                queryNormal.addWhereRelatedTo("having", new BmobPointer(user));
                queryNormal.findObjects(new FindListener<Normal>() {
                    @Override
                    public void done(List<Normal> list, BmobException e) {
                        //获取到食物列表，用到适配器中，至此，设置好图片id后，理论上应该能够显示用户拥有的该类食物
                        normalList = list;
                        adapterNormal = new quesNormalAdapter(normalList);
                        recyclerView.setAdapter(adapterNormal);
                    }
                });
                break;
            case R.id.ques_back:
                finish();
                break;
            default:
                break;
        }
    }
}
