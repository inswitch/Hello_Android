package com.example.inswi.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView mHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHello=(TextView)findViewById(R.id.textView);
    }

    public void onClick(View view) {
        mHello.setText("Just do it!");
    }
}
