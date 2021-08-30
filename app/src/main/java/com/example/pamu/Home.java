package com.example.pamu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView btnMoveActivity = findViewById(R.id.btn_nasigoreng);
        ImageView btnAkun = findViewById(R.id.hm_akun);
        ImageView btnPesan = findViewById(R.id.hm_pesan);
        ImageView btnKrj = findViewById(R.id.hm_krj);

        btnMoveActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Home.this,Detail_Barang.class);
                startActivity(intent);
            }
        });
        btnAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Home.this,AkunPembeli.class);
                startActivity(intent);
            }
        });
        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Home.this,Chats.class);
                startActivity(intent);
            }
        });
        btnKrj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Home.this,Keranjang.class);
                startActivity(intent);
            }
        });

    }
}