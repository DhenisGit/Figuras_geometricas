package com.dhenis.polomorfismo;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button botonpadre;
    Button botonmadre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //boton
        botonpadre = findViewById(R.id.btnPadres);
        botonmadre = findViewById(R.id.btnMadres);

        /*//busqueda por id
        int id = 0;
        int id_2 = 1;

        //lista hijos

        List<Hijo> hijoList = new ArrayList<>();
        hijoList.add(new Hijo(0,"Dhenis",padresList.get(id).getApellido_p(),madresList.get(id).getApellido_p(),18));
        hijoList.add(new Hijo(1,"Maria",padresList.get(id_2).getApellido_p(),madresList.get(id_2).getApellido_p(),12));

        System.out.println("id del hijo es : "+hijoList.get(id).getId());
        System.out.println("Nombre : "+hijoList.get(id).getNombre());
        System.out.println("apellido paterno : "+hijoList.get(id).getApellido_p());
        System.out.println("apellido materno : "+hijoList.get(id).getApellido_m());
        System.out.println("edad del hijo : "+hijoList.get(id).getEdad());

        System.out.println("id del hijo es : "+hijoList.get(id_2).getId());
        System.out.println("Nombre : "+hijoList.get(id_2).getNombre());
        System.out.println("apellido paterno : "+hijoList.get(id_2).getApellido_p());
        System.out.println("apellido materno : "+hijoList.get(id_2).getApellido_m());
        System.out.println("edad del hijo : "+hijoList.get(id_2).getEdad());*/

        botonpadre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ListaPadres.class);
                startActivity(intent);
                finish();
            }
        });

        botonmadre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListaMadres.class);
                startActivity(intent);
                finish();
            }
        });



    }
}