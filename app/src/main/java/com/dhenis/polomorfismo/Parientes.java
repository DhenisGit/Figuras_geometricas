package com.dhenis.polomorfismo;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class Parientes extends AppCompatActivity {


    private final List<Padres>PadreId = new ArrayList<>();
    private LinearLayout parentContainerPadres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_hijos);



        MaterialButton otrabusquedaButton = findViewById(R.id.otrabusqueda);
        otrabusquedaButton.setOnClickListener(v -> {
            Intent intent = new Intent(otrabusquedaButton.getContext(), MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish();
        });

        // Agregar algunos hijos a la lista (puedes obtenerlos de tus datos reales)
        PadreId.add(new Padres(1,"Juanito", "pp", "df", 10));
        PadreId.add(new Padres(1,"Mario", "pp", "df", 10));
        PadreId.add(new Padres(2,"María", "pp", "df", 8));
        PadreId.add(new Padres(3,"Pedro", "pp", "df", 12));

        parentContainerPadres = findViewById(R.id.parentContainerPadres);


        Bundle recibeDatos = getIntent().getExtras();
        if (recibeDatos != null) {
            int parentId = recibeDatos.getInt("parent_id");
            String apellidoMaterno = recibeDatos.getString("apellido_materno");
            String apellidoPaterno = recibeDatos.getString("apellido_paterno");
            showHijosViews(parentId , apellidoPaterno, apellidoMaterno);
        }
    }
    @SuppressLint("SetTextI18n")
    private void showHijosViews(int parentId, String apellidoPaterno, String apellidoMaterno) {
        List<Padres>hijosConMismoId= new ArrayList<>();
        for (Padres padres : PadreId) {
            if (padres.getId() == parentId) {
                if (apellidoPaterno != null) {
                    padres.setApellido_p(apellidoPaterno);
                }
                if (apellidoMaterno != null) {
                    padres.setApellido_m(apellidoMaterno);
                }
                hijosConMismoId.add(padres);
            }
        }
        for (Padres hijo1 : hijosConMismoId) {
            @SuppressLint("InflateParams") View cardView = getLayoutInflater().inflate(R.layout.parientes_elementos, null);

            TextView nombreTextView = cardView.findViewById(R.id.textnombre);
            TextView apellidosTextView = cardView.findViewById(R.id.textapellidos);
            TextView edadTextView = cardView.findViewById(R.id.textedad);

            nombreTextView.setText(hijo1.getNombre());
            apellidosTextView.setText(hijo1.getApellido_p() + " " + hijo1.getApellido_m());
            edadTextView.setText(hijo1.getEdad() + " años");

            parentContainerPadres.addView(cardView);
        }
    }
}