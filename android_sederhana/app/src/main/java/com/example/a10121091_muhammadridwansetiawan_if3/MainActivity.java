package com.example.a10121091_muhammadridwansetiawan_if3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNIM, etNama, etTempatTanggalLahir, etProgramStudi, etAlamat;
    private RadioGroup rgJenisKelamin;
    private Button btnTampilData, btnHapusData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNIM = findViewById(R.id.etNIM);
        etNama = findViewById(R.id.etNama);
        etTempatTanggalLahir = findViewById(R.id.etTempatTanggalLahir);
        rgJenisKelamin = findViewById(R.id.rgJenisKelamin);
        etProgramStudi = findViewById(R.id.etProgramStudi);
        etAlamat = findViewById(R.id.etAlamat);
        btnTampilData = findViewById(R.id.btnTampilData);
        btnHapusData = findViewById(R.id.btnHapusData);

        btnTampilData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jenisKelamin = ((RadioButton) findViewById(rgJenisKelamin.getCheckedRadioButtonId())).getText().toString();

                Intent intent = new Intent(MainActivity.this, activity_2.class);
                intent.putExtra("NIM", etNIM.getText().toString());
                intent.putExtra("Nama", etNama.getText().toString());
                intent.putExtra("TempatTanggalLahir", etTempatTanggalLahir.getText().toString());
                intent.putExtra("JenisKelamin", jenisKelamin);
                intent.putExtra("ProgramStudi", etProgramStudi.getText().toString());
                intent.putExtra("Alamat", etAlamat.getText().toString());
                startActivity(intent);
            }
        });

        btnHapusData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNIM.setText("");
                etNama.setText("");
                etTempatTanggalLahir.setText("");
                rgJenisKelamin.clearCheck();
                etProgramStudi.setText("");
                etAlamat.setText("");
            }
        });
    }
}