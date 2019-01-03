package com.example.hasee.shiyuji.Test;

import android.content.Context;
import android.widget.Toast;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;
import cn.bmob.v3.listener.SaveListener;

public class UserDao {
    /*
    账号密码注册
     */
    public void signUp(final Context context){
        final User user = new User();
        user.setUsername("abin" );
        user.setPassword("123" );
        user.setAge(18);
        user.setGender(0);
        user.signUp(new SaveListener<User>() {
            @Override
            public void done(User user, BmobException e) {
                if (e == null) {
                    Toast.makeText(context, "注册成功", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "注册失败" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void login(final Context context){
        final User user = new User();
        user.setUsername("abin" );
        user.setPassword("123" );
        user.login(new SaveListener<User>() {
            @Override
            public void done(User user, BmobException e) {
                if (e == null) {
                    Toast.makeText(context, "登陆成功" + user.getUsername(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "登陆失败" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void loginAccount(final Context context){
        BmobUser.loginByAccount("abin", "123", new LogInListener<User>() {
            @Override
            public void done(User user, BmobException e) {
                if (e == null) {
                    Toast.makeText(context, "登陆成功" + user.getUsername(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "登陆失败" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
