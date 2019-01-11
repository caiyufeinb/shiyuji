package com.example.hasee.shiyuji.Adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hasee.shiyuji.DB.Hot;
import com.example.hasee.shiyuji.DB.Warm;
import com.example.hasee.shiyuji.Log.LogUtil;
import com.example.hasee.shiyuji.R;

import java.util.List;

/**
 * 该类用作答题界面的食物的适配器
 * 相比之前的适配器，点击食物图片得到的监听事件
 * 从跳转到食物的详细介绍界面变成了跳出对话框处理答题逻辑
 */
public class quesWarmAdapter extends RecyclerView.Adapter<quesWarmAdapter.ViewHolder> {
    private static final String TAG = "quesHotAdapter";
    private Context context;
    private List<Warm> warmList;

    /*
    构造函数，将包含数据的数组传入
     */
    public quesWarmAdapter(List<Warm> warmList) {
        this.warmList = warmList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }
        View view = LayoutInflater.from(context).inflate(R.layout.food_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        //点击食物图片后弹出对话框，进行相应的逻辑处理
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                final Warm warm = warmList.get(position);
                //创建对话框对象,设置基本属性
                final AlertDialog.Builder commit = new AlertDialog.Builder(context);
                commit.setTitle("123");
                commit.setMessage("456");
                commit.setIcon(R.drawable.ic_done);
                commit.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //此处填写答题评分逻辑
                        LogUtil.d(TAG, "点击确定");
                    }
                });
                commit.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        LogUtil.d(TAG, "点击取消");
                    }
                });
                commit.setCancelable(false);
                commit.create();
                commit.show();
            }
        });
        return holder;
    }

    /*
    为每个子项设置名字和图片
    */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Warm warm = warmList.get(position);
        holder.coldName.setText(warm.getFoodName());
        Glide.with(context).load(warm.getImageId()).into(holder.coldImage);
    }

    @Override
    public int getItemCount() {
        return warmList.size();
    }

    /*
    静态内部类ViewHolder，用来初始化子项中的各个组件
     */
    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView coldImage;
        TextView coldName;

        ViewHolder(View view) {
            super(view);
            cardView = (CardView) view;
            coldImage = view.findViewById(R.id.food_img);
            coldName = view.findViewById(R.id.food_name);
        }
    }
}
