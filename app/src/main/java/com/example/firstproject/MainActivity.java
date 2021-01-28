package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{

    public int jumlah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtaws = findViewById(R.id.tv_aws);
        TextView txtNama = findViewById(R.id.tv_nama);
        TextView txtAlamat = findViewById(R.id.tv_alamat);
        Button btnMove = findViewById(R.id.btn_pindah);

        txtaws.setText("Selamat Datang");
        txtNama.setText("Sukarna");
        txtAlamat.setText("Kalong Liud");

        txtNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Anda Menekan tulisan "+txtNama.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        txtAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Anda Menekan tulisan alamat ",
                        Toast.LENGTH_SHORT).show();
            }
        });

        txtaws.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumlah++;
                Toast.makeText(getApplicationContext(),
                        "Anda Click Text AWS !! " + jumlah + " Kali",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityKedua.class);
                intent.putExtra("aws_key", txtaws.getText());
                intent.putExtra("nama_key", txtNama.getText());
                startActivity(intent);

            //ini komentar
            //cuma untuk test

            }
        });
    }
}
