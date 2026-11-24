package com.example.intentstudentpractice;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.*;

public class DetailActivity extends AppCompatActivity {
    TextView tvMaSV, tvHoTen, tvTuoi;
    Button btnQuayLai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);

        tvMaSV = findViewById(R.id.tvMaSV);
        tvHoTen = findViewById(R.id.tvHoTen);
        tvTuoi = findViewById(R.id.tvTuoi);
        btnQuayLai = findViewById(R.id.btnQuayLai);

        String maSV = getIntent().getStringExtra("ma_sv");
        String hoten = getIntent().getStringExtra("ho_ten");
        int tuoi = getIntent().getIntExtra("tuoi", 0);

        tvMaSV.setText("Ma SV: " + maSV);
        tvHoTen.setText("Ho Ten: " + hoten);
        tvTuoi.setText("Tuoi: " + tuoi);

        btnQuayLai.setOnClickListener(v ->{
            finish();
        });
    }
}


