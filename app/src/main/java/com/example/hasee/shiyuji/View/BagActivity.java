package com.example.hasee.shiyuji.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.hasee.shiyuji.Adapter.coldAdapter;
import com.example.hasee.shiyuji.Adapter.coolAdapter;
import com.example.hasee.shiyuji.Adapter.hotAdapter;
import com.example.hasee.shiyuji.Adapter.normalAdapter;
import com.example.hasee.shiyuji.Adapter.warmAdapter;
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
 * 该类用来显示背包界面
 * 背包界面包含各个分类的食物，每个食物分类配有一个按钮
 * 按下当前按钮会显示当前用户拥有的该种类的食物
 * 点击该事物的图片会跳转到该事物的详细解释
 */
public class BagActivity extends AppCompatActivity implements View.OnClickListener {
    /*
    声明控件阶段
     */
    //声明RecyclerView
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
    //五种食物的适配器，这里我先实现一种测试
    private coldAdapter adapterCold;
    private coolAdapter adapterCool;
    private hotAdapter adapterHot;
    private warmAdapter adapterWarm;
    private normalAdapter adapterNormal;
    /*
    缺少功能：给各个食物添加图片id，等图片到后再添加数据
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag);
        //获取RecyclerView控件，设置布局为网格布局，每行两个
        recyclerView = findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        coldBtn = findViewById(R.id.btn_cold);
        coolBtn = findViewById(R.id.btn_cool);
        hotBtn = findViewById(R.id.btn_hot);
        warmBtn = findViewById(R.id.btn_warm);
        normalBtn = findViewById(R.id.btn_normal);
        back = findViewById(R.id.btn_back);
        coldBtn.setOnClickListener(this);
        coolBtn.setOnClickListener(this);
        hotBtn.setOnClickListener(this);
        warmBtn.setOnClickListener(this);
        normalBtn.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    //按钮的监听事件，点击后显示当前食物的RecyclerView列表
    @Override
    public void onClick(View v) {
        //获取当前用户
        GameUser user = BmobUser.getCurrentUser(GameUser.class);
        switch (v.getId()) {
            case R.id.btn_cold:
                //查询当前用户拥有的寒性食物,查询的是寒性食物表
                BmobQuery<Cold> queryCold = new BmobQuery<>();
                queryCold.addWhereRelatedTo("having", new BmobPointer(user));
                queryCold.findObjects(new FindListener<Cold>() {
                    @Override
                    public void done(List<Cold> list, BmobException e) {
                        //获取到食物列表，用到适配器中，至此，设置好图片id后，理论上应该能够显示用户拥有的寒性食物
                        coldList = list;
                        adapterCold = new coldAdapter(coldList);
                        recyclerView.setAdapter(adapterCold);
                    }
                });
                break;
            case R.id.btn_cool:
                BmobQuery<Cool> queryCool = new BmobQuery<>();
                queryCool.addWhereRelatedTo("having", new BmobPointer(user));
                queryCool.findObjects(new FindListener<Cool>() {
                    @Override
                    public void done(List<Cool> list, BmobException e) {
                        //获取到食物列表，用到适配器中，至此，设置好图片id后，理论上应该能够显示用户拥有的该类食物
                        coolList = list;
                        adapterCool = new coolAdapter(coolList);
                        recyclerView.setAdapter(adapterCool);
                    }
                });
                break;
            case R.id.btn_hot:
                BmobQuery<Hot> queryHot = new BmobQuery<>();
                queryHot.addWhereRelatedTo("having", new BmobPointer(user));
                queryHot.findObjects(new FindListener<Hot>() {
                    @Override
                    public void done(List<Hot> list, BmobException e) {
                        //获取到食物列表，用到适配器中，至此，设置好图片id后，理论上应该能够显示用户拥有的该类食物
                        hotList = list;
                        adapterHot = new hotAdapter(hotList);
                        recyclerView.setAdapter(adapterHot);
                    }
                });
                break;
            case R.id.btn_warm:
                BmobQuery<Warm> queryWarm = new BmobQuery<>();
                queryWarm.addWhereRelatedTo("having", new BmobPointer(user));
                queryWarm.findObjects(new FindListener<Warm>() {
                    @Override
                    public void done(List<Warm> list, BmobException e) {
                        //获取到食物列表，用到适配器中，至此，设置好图片id后，理论上应该能够显示用户拥有的该类食物
                        warmList = list;
                        adapterWarm = new warmAdapter(warmList);
                        recyclerView.setAdapter(adapterWarm);
                    }
                });
                break;
            case R.id.btn_normal:
                BmobQuery<Normal> queryNormal = new BmobQuery<>();
                queryNormal.addWhereRelatedTo("having", new BmobPointer(user));
                queryNormal.findObjects(new FindListener<Normal>() {
                    @Override
                    public void done(List<Normal> list, BmobException e) {
                        //获取到食物列表，用到适配器中，至此，设置好图片id后，理论上应该能够显示用户拥有的该类食物
                        normalList = list;
                        adapterNormal = new normalAdapter(normalList);
                        recyclerView.setAdapter(adapterNormal);
                    }
                });
                break;
            case R.id.btn_back:
                finish();
                break;
            default:
                break;
        }
    }
}
