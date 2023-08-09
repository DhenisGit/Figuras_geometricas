package com.dhenis.polomorfismo.padres;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.dhenis.polomorfismo.MainActivity;
import com.dhenis.polomorfismo.R;
import com.dhenis.polomorfismo.utils.BrowseActivities;

public class DadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dad);
        CardView btnBack = findViewById(R.id.a_dad_cv_back);
        btnBack.setOnClickListener(v -> {
            BrowseActivities.cambiarActividad(this, MainActivity.class);
            finish();
        });
    }
}