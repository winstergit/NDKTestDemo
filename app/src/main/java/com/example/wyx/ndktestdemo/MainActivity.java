package com.example.wyx.ndktestdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.wyx.ndktestdemo.ndk.JNIUtils;

public class MainActivity extends AppCompatActivity {
    private TextView tv_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_show=(TextView)findViewById(R.id.tv_show);
        tv_show.setText(JNIUtils.getStringFormC());
    }
}
