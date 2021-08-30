package com.example.pamu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Pesan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);

        TextView btnMoveActivity = findViewById(R.id.chats);
        TextView btnPermintaan = findViewById(R.id.permintaan_pembeli);
        ImageView btnHome = findViewById(R.id.psn_home);
        ImageView btnAkun = findViewById(R.id.psn_akun);

        btnMoveActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Pesan.this,Chats.class);
                startActivity(intent);
            }
        });
        btnPermintaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Pesan.this,PermintaanPembeli.class);
                startActivity(intent);
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Pesan.this,Home.class);
                startActivity(intent);
            }
        });
        btnAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Pesan.this,akun_penjual.class);
                startActivity(intent);
            }
        });
    }
}