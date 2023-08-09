package com.dhenis.polomorfismo.madres;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.dhenis.polomorfismo.MainActivity;
import com.dhenis.polomorfismo.R;
import com.dhenis.polomorfismo.utils.BrowseActivities;

public class MonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon);
        CardView btnBack = findViewById(R.id.a_mom_cv_back);
        btnBack.setOnClickListener(v -> {
            BrowseActivities.cambiarActividad(this, MainActivity.class);
            finish();
        });
    }
}