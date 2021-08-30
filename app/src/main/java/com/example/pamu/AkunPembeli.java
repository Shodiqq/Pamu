package com.example.pamu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AkunPembeli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun_pembeli);

        TextView btnToPmnjl = findViewById(R.id.pmbli_toPenjl);

        btnToPmnjl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (AkunPembeli.this,akun_penjual.class);
                startActivity(intent);
            }
        });
    }
}