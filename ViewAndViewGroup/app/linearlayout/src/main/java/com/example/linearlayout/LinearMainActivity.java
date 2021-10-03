package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LinearMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_main);
    }


    //버튼 눌렀을때 equalactivity실행 되도록 하려
    public void equal_button_click(View view) {

        Intent intent = new Intent(getApplicationContext(), EqualActivity.class); //우리가 실행할거 넣어
        startActivity(intent);//intent전달해서 실행할 수 있도록함.

    }

    public void unequal_button_click(View view) {
        Intent intent = new Intent(getApplicationContext(), UnequalActivity.class);
        startActivity(intent);
    }

}