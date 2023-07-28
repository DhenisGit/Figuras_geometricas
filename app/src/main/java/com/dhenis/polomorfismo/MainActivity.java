package com.dhenis.polomorfismo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.dhenis.polomorfismo.herencia.Hijo;
import com.dhenis.polomorfismo.herencia.Madre;
import com.dhenis.polomorfismo.herencia.Padre;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Padre> padreList = new ArrayList<>();
        padreList.add(new Padre(0, "German", "Gonzalo", "Quispe", 39));
        padreList.add(new Padre(2, "Gerardo", "Valencia", "Quiños", 41));
        padreList.add(new Padre(3, "Alejandro", "Perez", "Garcia", 33));
        padreList.add(new Padre(4, "Diego", "Martines", "Osorio", 29));
        padreList.add(new Padre(5, "Marcos", "Calderon", "Peralta", 36));

        List<Madre> madresList = new ArrayList<>();
        madresList.add(new Madre(02, "Maria", "Gomez", "Fernandez", 29));
        madresList.add(new Madre(2, "Ana", "Rodriguez", "Soto", 39));
        madresList.add(new Madre(3, "Laura", "Ramirez", "Morales", 22));
        madresList.add(new Madre(4, "Sofia", "Lopez", "Silva", 26));
        madresList.add(new Madre(5, "Isabel", "Sanchez", "Ortega", 28));

        int id = 0;
        id = padreList.get(id).getId();
        List<Hijo> hijosList = new ArrayList<>();
        hijosList.add(new Hijo(1, "Dhenis", padreList.get(id).getApellido_p(), "a", 20));
        /*hijosList.add(new Hijo(2, "Andres", padreList.get(1).getApellido_p(), madresList.get(1).getApellido_p(), 10));
        hijosList.add(new Hijo(3, "Cristiano", padreList.get(2).getApellido_p(), madresList.get(2).getApellido_p(), 6));
        hijosList.add(new Hijo(4, "Messi", padreList.get(3).getApellido_p(), madresList.get(3).getApellido_p(), 12));
        hijosList.add(new Hijo(5, "Neymar", padreList.get(4).getApellido_p(), madresList.get(4).getApellido_p(), 23));*/
        System.out.println("==========================================");
        System.out.println("Apellido paterno: " + hijosList.get(id).getApellido_p());
        System.out.println("==========================================");


    }
}
