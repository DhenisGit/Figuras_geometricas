package com.dhenis.polomorfismo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class HijoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_hijo);
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

        View padre_include = findViewById(R.id.includePadre);
        ImageView image_Padre = padre_include.findViewById(R.id.imagen_Padre);
        TextView text_Padre = padre_include.findViewById(R.id.text_Padre);
        image_Padre.setBackgroundResource(R.drawable.persona);
        String Completo_nombre_Padre=nombrePadre+" "+apellidoPaternoPadre+" "+apellidoMaternoPadre;
        text_Padre.setText(Completo_nombre_Padre);

        View Madre_include = findViewById(R.id.includeMadre);
        ImageView imagen_Madre = Madre_include.findViewById(R.id.imagen_Madre);
        TextView text_Madre = Madre_include.findViewById(R.id.text_Madre);
        imagen_Madre.setBackgroundResource(R.drawable.persona);
        String Completo_nombre_Madre = nombreMadre + " " + apellidoPaternoMadre + " " + apellidoMaternoMadre;
        text_Madre.setText(Completo_nombre_Madre);

        Hijo_text(nombreHijo, apellidoPaterno, apellidoMaterno, apellidoPaternoPadre, apellidoMaternoMadre, edadHijo);
        Hija_text(nombreHija, apellidoPaterno, apellidoMaterno, apellidoPaternoPadre, apellidoMaternoMadre, edadHija);
        MaterialButton Regresar_Inicio = findViewById(R.id.otrabusqueda);
        Regresar_Inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(HijoActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });
    }

    private void Hijo_text(String nombre_Hijo, String apellidoPaterno, String apellidoMaterno, String apellidoPaternoPadre, String apellidoPaternoMadre, int edad_Hijo) {
        TextView text_Nombre_Hijo = findViewById(R.id.text_Hijo);
        TextView text_Edad_Hijo = findViewById(R.id.edad_Hijo);
        String Nombre_Completo_Hijo = nombre_Hijo+" "+apellidoPaterno+" "+apellidoMaterno;
        text_Nombre_Hijo.setText(Nombre_Completo_Hijo);
        text_Edad_Hijo.setText(String.valueOf(edad_Hijo)+" años");
    }

    private void Hija_text(String nombreHija, String apellidoPaterno, String apellidoMaterno, String apellidoPaternoPadre, String apellidoPaternoMadre, int edadHija) {
        TextView text_Nombre_Hija = findViewById(R.id.text_Hija);
        TextView text_Edad_Hija = findViewById(R.id.edad_Hija);
        String Nombre_Completo_Hija = nombreHija+" "+apellidoPaterno+" "+apellidoMaterno;
        text_Nombre_Hija.setText(Nombre_Completo_Hija);
        text_Edad_Hija.setText(String.valueOf(edadHija)+" años");
    }
}
