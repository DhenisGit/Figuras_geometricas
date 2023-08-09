package com.dhenis.polomorfismo;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.dhenis.polomorfismo.madres.MonActivity;
import com.dhenis.polomorfismo.padres.DadActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView btnDad = findViewById(R.id.a_mn_cv_dad);
        CardView btnMon = findViewById(R.id.a_mn_cv_mom);

        btnDad.setOnClickListener(v -> {
            startActivity(new Intent(this, DadActivity.class));
            finish();
        });
        btnMon.setOnClickListener(v -> {
            startActivity(new Intent(this, MonActivity.class));
            finish();
        });
    }
}