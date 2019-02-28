package com.mrhi2018.fcmtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv= findViewById(R.id.tv);

        Intent intent= getIntent();
        String name= intent.getStringExtra("name");
        String msg= intent.getStringExtra("msg");

        tv.setText("이름: "+name+"\n"+ "메세지: "+msg);
    }
}
