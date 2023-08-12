package com.dhenis.polomorfismo.listas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dhenis.polomorfismo.MainActivity;
import com.dhenis.polomorfismo.R;
import com.dhenis.polomorfismo.constructores.ConstructorHija;
import com.dhenis.polomorfismo.constructores.ConstructorHijo;
import com.google.android.material.button.MaterialButton;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ListaHijos extends AppCompatActivity {

    private List<ConstructorHijo> hijoList;
    private List<ConstructorHija> hijaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijos);

        Intent intent = getIntent();

        String nombreHijo = intent.getStringExtra("nombreHijo");
        int edadHijo = intent.getIntExtra("edadHijo", 0); //Obtiene la edad del hijo
        String foto_hijo = intent.getStringExtra("foto_hijo");

        String nombreHija = intent.getStringExtra("nombreHija");
        int edadHija = intent.getIntExtra("edadHija", 0); //Obtiene la edad de la hija
        String foto_hija = intent.getStringExtra("foto_hija");

        String apellidoPaterno = intent.getStringExtra("apellidoPaterno_padre");
        String apellidoMaterno = intent.getStringExtra("apellidoMaterno_padre");

        String nombrePadre = intent.getStringExtra("nombrePadre"); // Agregado
        String apellidoPaternoPadre = intent.getStringExtra("apellidoPaterno_padre"); // Agregado
        String apellidoMaternoPadre = intent.getStringExtra("apellidoMaterno_padre"); // Agregado
        String foto_padre = intent.getStringExtra("foto_padre");

        String nombreMadre = intent.getStringExtra("nombreMadre"); // Agregado
        String apellidoPaternoMadre = intent.getStringExtra("apellidoPaternoMadre"); // Agregado
        String apellidoMaternoMadre = intent.getStringExtra("apellidoMaternoMadre"); // Agregado
        String foto_madre = intent.getStringExtra("foto_madre");

        // Mostrar detalles del padre
        View includePadre = findViewById(R.id.includePadre);
        ImageView imagenViewPadre = includePadre.findViewById(R.id.imagenview6); // Corregido el ID del ImageView
        TextView textNamePadre = includePadre.findViewById(R.id.textnamePero); // Corregido el ID del TextView
        String nombreCompletoPadre = nombrePadre + " " + apellidoPaternoPadre + " " + apellidoMaternoPadre;
        textNamePadre.setText(nombreCompletoPadre);

        String imageUrlPadre = intent.getStringExtra("foto_padre"); // Obtén la URL de la imagen del padre desde el Intent
        Picasso.get().load(foto_padre).into(imagenViewPadre);


        View includeMadre = findViewById(R.id.includeMadre);
        ImageView imagenViewMadre = includeMadre.findViewById(R.id.imagenviewMadre);
        TextView textNameMadre = includeMadre.findViewById(R.id.textnameMadre);
        String nombreCompletoMadre = nombreMadre + " " + apellidoPaternoMadre + " " + apellidoMaternoMadre;
        textNameMadre.setText(nombreCompletoMadre);

        String imageUrlMadre = intent.getStringExtra("foto_madre"); // Obtén la URL de la imagen del padre desde el Intent
        Picasso.get().load(foto_madre).into(imagenViewMadre);


        // Mostrar detalles del hijo
        mostrarHijoEnTextViews(nombreHijo, apellidoPaterno, apellidoMaterno, apellidoPaternoPadre, apellidoPaternoMadre, edadHijo, foto_hijo); //Pasa la edad del hijo
        String imageUrlHijo = intent.getStringExtra("foto_hijo"); // Obtén la URL de la imagen del hijo desde el Intent
        ImageView imageViewHijo = findViewById(R.id.imagenview1);
        Picasso.get().load(foto_hijo).into(imageViewHijo);

        mostrarHijaEnTextViews(nombreHija, apellidoPaterno, apellidoMaterno, apellidoPaternoPadre, apellidoPaternoMadre, edadHija, foto_hija); //Pasa la edad de la hija
        String imageUrlHija = intent.getStringExtra("foto_hija"); // Obtén la URL de la imagen del hijo desde el Intent
        ImageView imageViewHija = findViewById(R.id.imagenview);
        Picasso.get().load(foto_hija).into(imageViewHija);

        MaterialButton otrabusquedaButton = findViewById(R.id.otrabusqueda);
        otrabusquedaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaHijos.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void mostrarHijoEnTextViews(String nombreHijo, String apellidoPaterno, String apellidoMaterno, String apellidoPaternoPadre, String apellidoPaternoMadre, int edadHijo, String imageUrl) {
        Intent intent = getIntent();
        TextView textViewNombreHijo = findViewById(R.id.textname); // Asegúrate de tener este TextView en tu layout
        TextView textViewEdadHijo = findViewById(R.id.edadHijo); // Asegúrate de tener este TextView en tu layout
        String nombreCompletoHijo = nombreHijo + " " + " " + apellidoPaternoPadre + " " + apellidoPaternoMadre;
        textViewNombreHijo.setText(nombreCompletoHijo);
        textViewEdadHijo.setText(String.valueOf(edadHijo) + " años");
        String foto_hijo = intent.getStringExtra("foto_hijo");

        ImageView imageViewHijo = findViewById(R.id.imagenview1); // Asegúrate de tener el ImageView en tu layout
        Picasso.get().load(foto_hijo).into(imageViewHijo); // Carga la imagen usando Picasso
    }
    private void mostrarHijaEnTextViews(String nombreHija, String apellidoPaterno, String apellidoMaterno, String apellidoPaternoPadre, String apellidoPaternoMadre, int edadHija, String imageUrl) {
        TextView textViewNombreHija = findViewById(R.id.textnameHija); // Asegúrate de tener este TextView en tu layout
        TextView textViewEdadHija = findViewById(R.id.edadHija); // Asegúrate de tener este TextView en tu layout
        String nombreCompletoHija = nombreHija + " " + " " + apellidoPaternoPadre + " " + apellidoPaternoMadre;
        textViewNombreHija.setText(nombreCompletoHija);
        textViewEdadHija.setText(String.valueOf(edadHija) + " años"); // Muestra la edad de la hija

        ImageView imageViewHija = findViewById(R.id.imagenview); // Asegúrate de tener el ImageView en tu layout para la hija
        String imageUrlHija = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/0c99107f-d5e2-4cfa-9bd9-f53806134b93/dfxuxau-64af7ab9-f0bd-4032-9425-df125c3812b6.png/v1/fill/w_453,h_627/nina_hilos_con_cheems_by_josefrack_dfxuxau-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NjI3IiwicGF0aCI6IlwvZlwvMGM5OTEwN2YtZDVlMi00Y2ZhLTliZDktZjUzODA2MTM0YjkzXC9kZnh1eGF1LTY0YWY3YWI5LWYwYmQtNDAzMi05NDI1LWRmMTI1YzM4MTJiNi5wbmciLCJ3aWR0aCI6Ijw9NDUzIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.BXkwqa_M4CQ4FiIMqazlZAAaDN5OXxb0rtLJJw4b6mw"; // Reemplaza con la URL real de la imagen de la hija
        Picasso.get().load(imageUrlHija).into(imageViewHija); // Carga la imagen usando Picasso
    }

}