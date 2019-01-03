package com.example.hasee.shiyuji.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hasee.shiyuji.Dao.GameUserDao;
import com.example.hasee.shiyuji.Log.LogUtil;
import com.example.hasee.shiyuji.R;

/**
 * 该界面用来实现用户注册功能
 * 有注册和退出两个功能，现在暂时只能账户密码注册
 * 后来会继续添加邮箱注册和手机注册功能
 */
public class RegisterActivity extends AppCompatActivity {
    private static final String TAG = "RegisterActivity";
    //声明控件阶段
    private EditText userName;
    private EditText password;
    private EditText checkPassword;
    private Button register;
    private Button out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //实例化控件
        userName = findViewById(R.id.register_username);
        password = findViewById(R.id.register_password);
        checkPassword = findViewById(R.id.register_checkpassword);
        register = findViewById(R.id.register_register);
        out = findViewById(R.id.register_out);

        //给注册按钮添加监听事件
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = userName.getText().toString();
                String pwd = password.getText().toString();
                String checkPwd = checkPassword.getText().toString();
                LogUtil.v(TAG, pwd + "1234567");
                LogUtil.v(TAG, checkPwd + "1234567");
                if(account.equals("") || pwd.equals("") || checkPwd.equals("")){
                    Toast.makeText(RegisterActivity.this, "请填写信息" ,Toast.LENGTH_SHORT).show();
                }else{
                    if(!pwd.equals(checkPwd)){
                        Toast.makeText(RegisterActivity.this, "两次输入密码不一致，请重新填写" ,Toast.LENGTH_SHORT).show();
                    }else{
                        GameUserDao.signUp(account, pwd, RegisterActivity.this);
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });

        //给退出按钮添加监听事件
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
