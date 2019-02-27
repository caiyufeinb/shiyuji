package com.example.hasee.shiyuji.View;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hasee.shiyuji.DB.GameUser;
import com.example.hasee.shiyuji.R;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * 该界面是用户登录注册界面
 * 有登录，注册和记住密码功能
 * 选择记住账号密码之后，用户下次打开软件就可以直接登录
 */
public class LoginActivity extends AppCompatActivity {
    Button login;//登录按钮
    Button register;//注册按钮
    private SharedPreferences pref;//保存账号密码的控件
    private SharedPreferences.Editor editor;//将保存的账号密码输入文本框
    private CheckBox rememberPass;//选择是否要保存账号密码
    private EditText UserName;//用户名输入文本框
    private EditText Password;//密码输入文本框

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //第一：默认初始化
        Bmob.initialize(this, "7d2a4c381ee77e81c13e729d6c3b385b");
        setContentView(R.layout.activity_login_activiy);
        pref = PreferenceManager.getDefaultSharedPreferences(this);//获取SharedPreferences对象
        //实例化控件
        UserName = findViewById(R.id.user_account);
        Password = findViewById(R.id.user_psw);
        login = findViewById(R.id.login);
        rememberPass = findViewById(R.id.remember_psw);
        register = findViewById(R.id.register);
        //判断是否要保存账号密码
        boolean isRemember = pref.getBoolean("remember", false);
        if (isRemember) {
            //将账号密码设置在文本框中
            String account = pref.getString("account", "");
            String password = pref.getString("password", "");
            UserName.setText(account);
            Password.setText(password);
            rememberPass.setChecked(true);//设置checkedBox为选中状态
        }

        //设置登录按钮监听事件
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String account = UserName.getText().toString();
                final String password = Password.getText().toString();
                editor = pref.edit();
                //用户账号密码登录逻辑
                final GameUser user = new GameUser();
                user.setUsername(account);
                user.setPassword(password);
                user.login(new SaveListener<GameUser>() {
                    @Override
                    public void done(GameUser gameUser, BmobException e) {
                        if (e == null) {
                            if (rememberPass.isChecked()) {
                                editor.putBoolean("remember", true);
                                editor.putString("account", account);
                                editor.putString("password", password);
                            } else {
                                editor.clear();
                            }
                            editor.apply();
                            Intent intent = new Intent(LoginActivity.this, choiseActivity.class);
                            startActivity(intent);
                            Toast.makeText(LoginActivity.this, "登录成功" + gameUser.getMoney(), Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(LoginActivity.this, "登录失败，账号密码错误" + e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        //给注册按钮添加监听事件
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });


    }
}
