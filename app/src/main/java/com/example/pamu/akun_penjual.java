package com.example.pamu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class akun_penjual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun_penjual);

        ImageView btnBuat = findViewById(R.id.pnj_buatToko);
        ImageView btnStatistik = findViewById(R.id.pnj_statistik);
        ImageView btnLaporan = findViewById(R.id.pnj_laporan);

        btnBuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (akun_penjual.this,BuatToko.class);
                startActivity(intent);
            }
        });
        btnStatistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (akun_penjual.this,StatistikPenjualan.class);
                startActivity(intent);
            }
        });
        btnLaporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (akun_penjual.this,laporankeuangan_pemasukan.class);
                startActivity(intent);
            }
        });
    }
}