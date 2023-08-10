package com.dhenis.polomorfismo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.squareup.picasso.Picasso;

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
        String apellidoPaterno = intent.getStringExtra("apellidoPaterno_padre");
        String apellidoMaterno = intent.getStringExtra("apellidoMaterno_padre");
        String nombrePadre = intent.getStringExtra("nombrePadre"); // Agregado
        String apellidoPaternoPadre = intent.getStringExtra("apellidoPaterno_padre"); // Agregado
        String apellidoMaternoPadre = intent.getStringExtra("apellidoMaterno_padre"); // Agregado
        String nombreMadre = intent.getStringExtra("nombreMadre"); // Agregado
        String apellidoPaternoMadre = intent.getStringExtra("apellidoPaternoMadre"); // Agregado
        String apellidoMaternoMadre = intent.getStringExtra("apellidoMaternoMadre"); // Agregado

        // Mostrar detalles del padre
        View includePadre = findViewById(R.id.includePadre);
        ImageView imagenViewPadre = includePadre.findViewById(R.id.imagenview6); // Corregido el ID del ImageView
        TextView textNamePadre = includePadre.findViewById(R.id.textnamePero); // Corregido el ID del TextView
        String nombreCompletoPadre = nombrePadre + " " + apellidoPaternoPadre + " " + apellidoMaternoPadre;
        textNamePadre.setText(nombreCompletoPadre);

        String imageUrlPadre = "https://i.pinimg.com/564x/5b/4b/51/5b4b51d018d2e370efb82f0be7ace9cc.jpg"; // Reemplaza con la URL real de la imagen de la hija
        Picasso.get().load(imageUrlPadre).into(imagenViewPadre); // Carga la imagen usando Picasso


    View includeMadre = findViewById(R.id.includeMadre);
        ImageView imagenViewMadre = includeMadre.findViewById(R.id.imagenviewMadre);
        TextView textNameMadre = includeMadre.findViewById(R.id.textnameMadre);
        String nombreCompletoMadre = nombreMadre + " " + apellidoPaternoMadre + " " + apellidoMaternoMadre;
        textNameMadre.setText(nombreCompletoMadre);

        String imageUrlMadre = "https://image.winudf.com/v2/image1/Y29tLmFuaW1lZ2lybHByb2ZpbGVwaWN0dXJlLnJhbmlhYXBwc19zY3JlZW5fM18xNjg2MDEzNzczXzAyMQ/screen-3.webp?fakeurl=1&type=.webp"; // Reemplaza con la URL real de la imagen de la hija
        Picasso.get().load(imageUrlMadre).into(imagenViewMadre); // Carga la imagen usando Picasso


        // Mostrar detalles del hijo
        mostrarHijoEnTextViews(nombreHijo, apellidoPaterno, apellidoMaterno, apellidoPaternoPadre, apellidoPaternoMadre, edadHijo); //Pasa la edad del hijo
        mostrarHijaEnTextViews(nombreHija, apellidoPaterno, apellidoMaterno, apellidoPaternoPadre, apellidoPaternoMadre, edadHija); //Pasa la edad de la hija

        MaterialButton otrabusquedaButton = findViewById(R.id.otrabusqueda);
        otrabusquedaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hijos.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void mostrarHijoEnTextViews(String nombreHijo, String apellidoPaterno, String apellidoMaterno, String apellidoPaternoPadre, String apellidoPaternoMadre, int edadHijo) {
        TextView textViewNombreHijo = findViewById(R.id.textname); // Asegúrate de tener este TextView en tu layout
        TextView textViewEdadHijo = findViewById(R.id.edadHijo); // Asegúrate de tener este TextView en tu layout
        String nombreCompletoHijo = nombreHijo + " " + " " + apellidoPaternoPadre + " " + apellidoPaternoMadre;
        textViewNombreHijo.setText(nombreCompletoHijo);
        textViewEdadHijo.setText(String.valueOf(edadHijo) + " años"); // Muestra la edad del hijo

        ImageView imageViewHijo = findViewById(R.id.imagenview1); // Asegúrate de tener el ImageView en tu layout
        String imageUrlHijo = "https://i.pinimg.com/474x/86/1c/ef/861ceff72fd7336e41f1aade89ccd7de.jpg"; // Reemplaza con la URL real de la imagen del hijo
        Picasso.get().load(imageUrlHijo).into(imageViewHijo); // Carga la imagen usando Picasso
    }
    private void mostrarHijaEnTextViews(String nombreHija, String apellidoPaterno, String apellidoMaterno, String apellidoPaternoPadre, String apellidoPaternoMadre, int edadHija) {
        TextView textViewNombreHija = findViewById(R.id.textnameHija); // Asegúrate de tener este TextView en tu layout
        TextView textViewEdadHija = findViewById(R.id.edadHija); // Asegúrate de tener este TextView en tu layout
        String nombreCompletoHija = nombreHija + " " + " " + apellidoPaternoPadre + " " + apellidoPaternoMadre;
        textViewNombreHija.setText(nombreCompletoHija);
        textViewEdadHija.setText(String.valueOf(edadHija) + " años"); // Muestra la edad de la hija

        ImageView imageViewHija = findViewById(R.id.imagenview); // Asegúrate de tener el ImageView en tu layout para la hija
        String imageUrlHija = "https://i.pinimg.com/736x/6c/ed/18/6ced186c7178905c00f1cc939db27321.jpg"; // Reemplaza con la URL real de la imagen de la hija
        Picasso.get().load(imageUrlHija).into(imageViewHija); // Carga la imagen usando Picasso
    }

}