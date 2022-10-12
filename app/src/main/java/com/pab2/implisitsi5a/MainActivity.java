package com.pab2.implisitsi5a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eturl,etlokasi,etteks;
    Button btnbukawebsite, btnbagikanteks,btnbukalokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eturl = findViewById(R.id.et_url);
        etlokasi = findViewById(R.id.et_lokasi);
        etteks = findViewById(R.id.et_teks);
        btnbukawebsite = findViewById(R.id.btn_buka_website);
        btnbukalokasi = findViewById(R.id.btn_buka_lokasi);
        btnbagikanteks = findViewById(R.id.btn_bagikan_teks);

        btnbukawebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String urlwebsite = eturl.getText().toString();
               Uri uriurlwebsite = Uri.parse(urlwebsite);
                Intent intentwebsite = new Intent(Intent.ACTION_VIEW, uriurlwebsite);
                try {
                    startActivity(intentwebsite);
                }catch (Exception e) {
                    eturl.setError("URL TIDAK SESUAI");
                }
            }
        });

        btnbukalokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnbagikanteks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}