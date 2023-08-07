package com.dhenis.polomorfismo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.List;

public class hijos extends AppCompatActivity {

    private List<datos_hijos> hijoList;
    private List<datos_hija> hijaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijos);

        Intent intent = getIntent();
        String nombreHijo = intent.getStringExtra("nombreHijo");
        int edadHijo = intent.getIntExtra("edadHijo", 0); //Obtiene la edad del hijo
        String nombreHija = intent.getStringExtra("nombreHija");
        int edadHija = intent.getIntExtra("edadHija", 0); //Obtiene la edad de la hija
        String nombre = intent.getStringExtra("nombre");
        String apellidoPaterno = intent.getStringExtra("apellidoPaterno");
        String apellidoMaterno = intent.getStringExtra("apellidoMaterno");
        String nombreMadre = intent.getStringExtra("nombreMadre");
        String apellidoPaternoMadre = intent.getStringExtra("apellidoPaternoMadre");
        String apellidoMaternoMadre = intent.getStringExtra("apellidoMaternoMadre");

        // Mostrar detalles de los padres
        View includePadre = findViewById(R.id.includePadre);
        ImageView imagenViewPadre = includePadre.findViewById(R.id.imagenview);
        TextView textNamePadre = includePadre.findViewById(R.id.textnamePero);
        imagenViewPadre.setBackgroundResource(R.drawable.persona);
        String nombreCompletoPadre = nombre + " " + apellidoPaterno + " " + apellidoMaterno;
        textNamePadre.setText(nombreCompletoPadre);

        View includeMadre = findViewById(R.id.includeMadre);
        ImageView imagenViewMadre = includeMadre.findViewById(R.id.imagenviewMadre);
        TextView textNameMadre = includeMadre.findViewById(R.id.textnameMadre);
        imagenViewMadre.setBackgroundResource(R.drawable.persona);
        String nombreCompletoMadre = nombreMadre + " " + apellidoPaternoMadre + " " + apellidoMaternoMadre;
        textNameMadre.setText(nombreCompletoMadre);

        // Mostrar detalles del hijo
        mostrarHijoEnTextViews(nombreHijo, apellidoPaterno, apellidoMaterno, edadHijo); //Pasa la edad del hijo
        mostrarHijaEnTextViews(nombreHija, apellidoPaterno, apellidoMaterno, edadHija); //Pasa la edad de la hija



        MaterialButton otrabusquedaButton = findViewById(R.id.otrabusqueda);
        otrabusquedaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hijos.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void mostrarHijoEnTextViews(String nombreHijo, String apellidoPaterno, String apellidoMaterno, int edadHijo) {
        TextView textViewNombreHijo = findViewById(R.id.textname);
        TextView textViewEdadHijo = findViewById(R.id.edadHijo); // Asegúrate de tener este TextView en tu layout
        String nombreCompletoHijo = nombreHijo + " " + apellidoPaterno + " " + apellidoMaterno;
        textViewNombreHijo.setText(nombreCompletoHijo);
        textViewEdadHijo.setText(String.valueOf(edadHijo + " años")); // Muestra la edad del hijo
    }

    private void mostrarHijaEnTextViews(String nombreHija, String apellidoPaterno, String apellidoMaterno, int edadHija) {
        TextView textViewNombreHija = findViewById(R.id.textnameHija); // Asegúrate de tener este TextView en tu layout
        TextView textViewEdadHija = findViewById(R.id.edadHija); // Asegúrate de tener este TextView en tu layout
        String nombreCompletoHija = nombreHija + " " + apellidoPaterno + " " + apellidoMaterno;
        textViewNombreHija.setText(nombreCompletoHija);
        textViewEdadHija.setText(String.valueOf(edadHija + " años")); // Muestra la edad de la hija
    }
}
