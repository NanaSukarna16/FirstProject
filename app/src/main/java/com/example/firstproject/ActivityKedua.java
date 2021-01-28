package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        TextView tv = findViewById(R.id.tv_text);
        TextView tv2 = findViewById(R.id.tv_text2);

        Bundle ambil = getIntent().getExtras();
        if (ambil == null){
            return;
        }

        String aws = ambil.getString("aws_key");
        String nama = ambil.getString("nama_key");
        if (nama != null){
            tv.setText(nama);
        }
        if (aws != null){
            tv2.setText(aws);
        }
    }
}