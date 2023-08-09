package com.dhenis.polomorfismo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class PaginaHijos extends AppCompatActivity {


    private List<Hijo> hijosListId = new ArrayList<>();
    private LinearLayout parentContainerHijos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_hijos);



        MaterialButton otrabusquedaButton = findViewById(R.id.otrabusqueda);
        otrabusquedaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(otrabusquedaButton.getContext(), MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
                finish();
            }
        });

        // Agregar algunos hijos a la lista (puedes obtenerlos de tus datos reales)
        hijosListId.add(new Hijo(1,"Juanito", "df", "df", 10));
        hijosListId.add(new Hijo(1,"Mario", "df", "df", 10));
        hijosListId.add(new Hijo(2,"María", "h", "df", 8));
        hijosListId.add(new Hijo(3,"Pedro", "df", "df", 12));

        parentContainerHijos = findViewById(R.id.parentContainerHijos);


        Bundle recibeDatos = getIntent().getExtras();
        if (recibeDatos != null) {
            int parentId = recibeDatos.getInt("parent_id");
            String apellidoMaterno = recibeDatos.getString("apellido_materno");
            String apellidoPaterno = recibeDatos.getString("apellido_paterno");
            showHijosViews(parentId , apellidoPaterno, apellidoMaterno);
        }
    }
    private void showHijosViews(int parentId,String apellidoPaterno, String apellidoMaterno) {
        List<Hijo>hijosConMismoId= new ArrayList<>();
        for (Hijo hijo : hijosListId) {
            if (hijo.getId() == parentId) {
                if (apellidoPaterno != null) {
                    hijo.setApellido_p(apellidoPaterno);
                }
                if (apellidoMaterno != null) {
                    hijo.setApellido_m(apellidoMaterno);
                }
                hijosConMismoId.add(hijo);
            }
        }
        for (Hijo hijo1 : hijosConMismoId) {
            View cardView = getLayoutInflater().inflate(R.layout.definicion_elementos, null);

            TextView nombreTextView = cardView.findViewById(R.id.textnombre);
            TextView apellidosTextView = cardView.findViewById(R.id.textapellidos);
            TextView edadTextView = cardView.findViewById(R.id.textedad);

            nombreTextView.setText(hijo1.getNombre());
            apellidosTextView.setText(hijo1.getApellido_p() + " " + hijo1.getApellido_m());
            edadTextView.setText(hijo1.getEdad() + " años");

            parentContainerHijos.addView(cardView);
        }
    }
}