package com.nptinker.socialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnLogin, mRegisterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnLogin = findViewById(R.id.btn_login);
        mRegisterBtn = findViewById(R.id.btn_register);

        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startRegisterActivity
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });
    }
}
