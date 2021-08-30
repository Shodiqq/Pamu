package com.example.pamu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class laporankeuangan_pemasukan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporankeuangan_pemasukan);

        TextView btnPngeluaran = findViewById(R.id.pengeluaran);

        btnPngeluaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (laporankeuangan_pemasukan.this,laporankeuangan_pengeluaran.class);
                startActivity(intent);
            }
        });
    }
}