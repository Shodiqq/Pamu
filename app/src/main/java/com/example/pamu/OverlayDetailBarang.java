package com.example.pamu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OverlayDetailBarang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overlay_detail_barang);

        Button btnMoveActivity = findViewById(R.id.lanjutkan_ovdet);

        btnMoveActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (OverlayDetailBarang.this,Detail_Pembayaran.class);
                startActivity(intent);
            }
        });
    }
}