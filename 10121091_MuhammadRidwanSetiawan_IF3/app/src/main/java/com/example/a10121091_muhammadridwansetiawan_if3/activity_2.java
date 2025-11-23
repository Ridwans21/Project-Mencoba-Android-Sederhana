package com.example.a10121091_muhammadridwansetiawan_if3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_2 extends AppCompatActivity {

    private TextView tvDataBiodata;
    private Button btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvDataBiodata = findViewById(R.id.tvDataBiodata);
        btnKembali = findViewById(R.id.btnKembali);

        String data = "NIM: " + getIntent().getStringExtra("NIM") + "\n" +
                "Nama: " + getIntent().getStringExtra("Nama") + "\n" +
                "Tempat dan Tanggal Lahir: " + getIntent().getStringExtra("TempatTanggalLahir") + "\n" +
                "Jenis Kelamin: " + getIntent().getStringExtra("JenisKelamin") + "\n" +
                "Program Studi: " + getIntent().getStringExtra("ProgramStudi") + "\n" +
                "Alamat: " + getIntent().getStringExtra("Alamat");

        tvDataBiodata.setText(data);

        btnKembali.setOnClickListener(v -> finish());
    }
}