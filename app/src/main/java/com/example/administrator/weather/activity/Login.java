package com.example.administrator.weather.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.weather.R;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by Administrator on 2015/10/15.
 */
public class Login extends Activity {


    @Bind(R.id.username_edit)
    EditText usernameEdit;
    @Bind(R.id.password_edit)
    EditText passwordEdit;
    @Bind(R.id.login_button)
    Button loginButton;
    @Bind(R.id.checkbox_button)
    CheckBox checkboxButton;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.Login);
        ButterKnife.bind(this);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        final boolean Remember = preferences.getBoolean("remember_password", false);
        if (Remember) {
            String username = preferences.getString("username", "");
            String password = preferences.getString("password", "");
            usernameEdit.setText(username);
            passwordEdit.setText(password);
            checkboxButton.setChecked(true);
        }
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                if (username.equals("li") && password.equals("1")) {
                    editor = preferences.edit();
                    if (checkboxButton.isChecked()) {
                        editor.putBoolean("checkbox_button", true);
                        editor.putString("username", username);
                        editor.putString("password", password);
                    } else {
                        editor.clear();
                    }
                    editor.commit();

                    Intent intent = new Intent(Login.this, ChooseAreaActivity.class);
                    startActivity(intent);
                    Toast.makeText(Login.this, "登陆成功", Toast.LENGTH_SHORT).show();
                    finish();
                }  else {
                    Toast.makeText(Login.this, "登陆失败", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}




