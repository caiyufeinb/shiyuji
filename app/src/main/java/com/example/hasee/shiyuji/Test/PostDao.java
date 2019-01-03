package com.example.hasee.shiyuji.Test;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;

public class PostDao {
    public void savePost(final Context context){
        if(BmobUser.isLogin()){
            Post post = new Post();
            post.setTitle("title");
            post.setContent("content");
            //添加一对一关联，用户关联帖子,有了这边的代码后可以省略web端的操作
            post.setAuthor(BmobUser.getCurrentUser(User.class));
            post.save(new SaveListener<String>() {
                @Override
                public void done(String s, BmobException e) {
                    if (e == null) {
                        Toast.makeText(context, "发布帖子成功" + s, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(context, "发布帖子失败" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }else {
            Toast.makeText(context, "请先登陆", Toast.LENGTH_SHORT).show();
        }
    }

    public void queryPostAuthor(final Context context){
        if(BmobUser.isLogin()){
            BmobQuery<Post> query = new BmobQuery<>();
            query.addWhereEqualTo("author", BmobUser.getCurrentUser(User.class));
            query.order("-updateAt");
            //包含作者信息
            query.include("author");
            query.findObjects(new FindListener<Post>() {
                @Override
                public void done(List<Post> list, BmobException e) {
                    if (e == null) {
                        Toast.makeText(context, "查询成功" , Toast.LENGTH_SHORT).show();
                    } else {
                        Log.e("BMOB", e.toString());
                        Toast.makeText(context, "查询失败" + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }else {
            Toast.makeText(context, "请先登陆", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 修改一对一关联，修改帖子和用户的关系
     */
    public void updatePostAuthor(final Context context) {
        User user = new User();
        //填写要修改到的User的id
        user.setObjectId("bc863d3637");
        //填写要修改到的Post的id
        Post post = new Post();
        post.setObjectId("43b0fa9e85");
        //修改一对一关联，修改帖子和用户的关系
        post.setAuthor(user);
        post.update(new UpdateListener() {
            @Override
            public void done(BmobException e) {
                if (e == null) {
                    Toast.makeText(context, "修改帖子成功", Toast.LENGTH_SHORT).show();
                } else {
                    Log.e("BMOB", e.toString());
                    Toast.makeText(context, "修改失败" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    /**
     * 删除一对一关联，解除帖子和用户的关系
     */
    public void removePostAuthor(final Context context) {
        Post post = new Post();
        post.setObjectId("43b0fa9e85");
        //删除一对一关联，解除帖子和用户的关系
        post.remove("author");
        post.update(new UpdateListener() {
            @Override
            public void done(BmobException e) {
                if (e == null) {
                    Toast.makeText(context, "删除帖子成功", Toast.LENGTH_SHORT).show();
                } else {
                    Log.e("BMOB", e.toString());
                    Toast.makeText(context, "删除失败" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
