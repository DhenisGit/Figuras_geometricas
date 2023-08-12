package com.dhenis.polomorfismo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.dhenis.polomorfismo.listas.ListaMadre;
import com.dhenis.polomorfismo.listas.ListaPadre;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton btnPadres = findViewById(R.id.btnPadres);
        btnPadres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaPadre.class);
                startActivity(intent);
            }
        });

        MaterialButton btnMadres = findViewById(R.id.btnMadres);
        btnMadres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaMadre.class);
                startActivity(intent);
            }
        });
    }
}
