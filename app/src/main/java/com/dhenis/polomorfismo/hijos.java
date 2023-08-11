package com.dhenis.polomorfismo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.squareup.picasso.Picasso;

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
        int edadHijo = intent.getIntExtra("edadHijo", 0);
        String nombreHija = intent.getStringExtra("nombreHija");
        int edadHija = intent.getIntExtra("edadHija", 0);
        String apellidoPaterno = intent.getStringExtra("apellidoPaterno_padre");
        String apellidoMaterno = intent.getStringExtra("apellidoMaterno_padre");
        String nombrePadre = intent.getStringExtra("nombrePadre");
        String apellidoPaternoPadre = intent.getStringExtra("apellidoPaterno_padre");
        String apellidoMaternoPadre = intent.getStringExtra("apellidoMaterno_padre");
        String nombreMadre = intent.getStringExtra("nombreMadre");
        String apellidoPaternoMadre = intent.getStringExtra("apellidoPaternoMadre");
        String apellidoMaternoMadre = intent.getStringExtra("apellidoMaternoMadre");

        // Mostrar detalles del padre
        View includePadre = findViewById(R.id.includePadre);
        ImageView imagenViewPadre = includePadre.findViewById(R.id.imagenview6);
        TextView textNamePadre = includePadre.findViewById(R.id.textnamePero);
        String nombreCompletoPadre = nombrePadre + " " + apellidoPaternoPadre + " " + apellidoMaternoPadre;
        textNamePadre.setText(nombreCompletoPadre);

        String imageUrlPadre = "https://i.pinimg.com/564x/95/5b/49/955b490647e5e61980aabcf662dc11b1.jpg";
        Picasso.get().load(imageUrlPadre).into(imagenViewPadre);


    View includeMadre = findViewById(R.id.includeMadre);
        ImageView imagenViewMadre = includeMadre.findViewById(R.id.imagenviewMadre);
        TextView textNameMadre = includeMadre.findViewById(R.id.textnameMadre);
        String nombreCompletoMadre = nombreMadre + " " + apellidoPaternoMadre + " " + apellidoMaternoMadre;
        textNameMadre.setText(nombreCompletoMadre);

        String imageUrlMadre = "https://i.pinimg.com/564x/00/cb/d5/00cbd5394a30b07dfe749962878d6fa8.jpg";
        Picasso.get().load(imageUrlMadre).into(imagenViewMadre);


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
        TextView textViewNombreHijo = findViewById(R.id.textname);
        TextView textViewEdadHijo = findViewById(R.id.edadHijo);
        String nombreCompletoHijo = nombreHijo + " " + " " + apellidoPaternoPadre + " " + apellidoPaternoMadre;
        textViewNombreHijo.setText(nombreCompletoHijo);
        textViewEdadHijo.setText(String.valueOf(edadHijo) + " años");

        ImageView imageViewHijo = findViewById(R.id.imagenview1);
        String imageUrlHijo = "https://i.pinimg.com/564x/bc/98/30/bc98302aeb7e58d598b0b61bdc6171f4.jpg";
        Picasso.get().load(imageUrlHijo).into(imageViewHijo);
    }
    private void mostrarHijaEnTextViews(String nombreHija, String apellidoPaterno, String apellidoMaterno, String apellidoPaternoPadre, String apellidoPaternoMadre, int edadHija) {
        TextView textViewNombreHija = findViewById(R.id.textnameHija);
        TextView textViewEdadHija = findViewById(R.id.edadHija);
        String nombreCompletoHija = nombreHija + " " + " " + apellidoPaternoPadre + " " + apellidoPaternoMadre;
        textViewNombreHija.setText(nombreCompletoHija);
        textViewEdadHija.setText(String.valueOf(edadHija) + " años");

        ImageView imageViewHija = findViewById(R.id.imagenview);
        String imageUrlHija = "https://i.pinimg.com/564x/21/6f/bd/216fbdd021a71cc7049e97eda747b149.jpg";
        Picasso.get().load(imageUrlHija).into(imageViewHija);
    }

}