package com.example.pamu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnBoarding_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding1);
        Button btnMoveActivity = findViewById(R.id.ob1_masuk);

        btnMoveActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (OnBoarding_1.this,OnBoarding_2.class);
                startActivity(intent);
            }
        });
    }
}