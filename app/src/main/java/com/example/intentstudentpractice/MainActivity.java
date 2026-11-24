package com.example.intentstudentpractice;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.*;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText edtMaSV, edtHoTen, edtTuoi;
    Button btnXemChiTiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtMaSV = findViewById(R.id.edtMaSV);
        edtHoTen = findViewById(R.id.edtHoTen);
        edtTuoi = findViewById(R.id.edtTuoi);
        btnXemChiTiet = findViewById(R.id.btnXemChiTiet);

        btnXemChiTiet.setOnClickListener(v->{
            String maSV = edtMaSV.getText().toString().trim();
            String hoTen = edtHoTen.getText().toString().trim();
            String tuoiText = edtTuoi.getText().toString();

            if(maSV.isEmpty() || hoTen.isEmpty() || tuoiText.isEmpty()){
                Toast.makeText(MainActivity.this,
                        "Vui long nhap day du thong tin",
                        Toast.LENGTH_SHORT).show();
                return;
            }
            int tuoi = Integer.parseInt(tuoiText);

            Intent intent = new Intent(
                    MainActivity.this, DetailActivity.class);
            intent.putExtra("ma_sv", maSV);
            intent.putExtra("ho_ten", hoTen);
            intent.putExtra("tuoi", tuoi);

            startActivity(intent);
        });

    }
}