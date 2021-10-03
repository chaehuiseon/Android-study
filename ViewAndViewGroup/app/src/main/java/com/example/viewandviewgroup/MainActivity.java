package com.example.viewandviewgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        helloText = findViewById(R.id.hello_text);
        helloText.setTextColor(0xFFFFFF00);
        helloText.setText(helloText.getTag().toString());
        //글자 크기 지정, size type지정 보통 sp사용함. 지정해주는 사이즈값 입력.
        helloText.setTextSize(TypedValue.COMPLEX_UNIT_SP,60);


    }
}