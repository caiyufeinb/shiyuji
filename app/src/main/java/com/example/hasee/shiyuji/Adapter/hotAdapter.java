package com.example.hasee.shiyuji.Adapter;

import android.content.Context;
import android.content.Intent;
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
import com.example.hasee.shiyuji.R;
import com.example.hasee.shiyuji.View.BagActivity;
import com.example.hasee.shiyuji.View.bag_foodActivity;

import java.util.List;

/**
 * 该类是热性食物RecyclerView的适配器，用来在RecyclerView中显示用户拥有的热性食物
 */
public class hotAdapter extends RecyclerView.Adapter<hotAdapter.ViewHolder> {
    private Context context;
    private List<Hot> hotList;

    /*
    构造函数，将包含数据的数组传入
     */
    public hotAdapter(List<Hot> hotList) {
        this.hotList = hotList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (context == null) {
            context = parent.getContext();
        }
        View view = LayoutInflater.from(context).inflate(R.layout.food_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        //点击食物图片后跳转到食物的详细介绍界面
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Hot hot = hotList.get(position);
                Intent intent = new Intent(context, bag_foodActivity.class);
                intent.putExtra(bag_foodActivity.FOOD_NAME, hot.getFoodName());
                intent.putExtra(bag_foodActivity.FOOD_IMAGE_ID, hot.getImageId());
                //用来提示自己点击的 是哪种类型的食物
                intent.putExtra(bag_foodActivity.TYPE, "hot");
                context.startActivity(intent);
            }
        });
        return holder;
    }

    /*
    为每个子项设置名字和图片
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Hot hot = hotList.get(position);
        holder.coldName.setText(hot.getFoodName());
        Glide.with(context).load(hot.getImageId()).into(holder.coldImage);
    }

    @Override
    public int getItemCount() {
        return hotList.size();
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
