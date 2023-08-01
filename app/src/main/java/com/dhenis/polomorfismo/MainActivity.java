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
        padreList.add(new Padre(5, "German", "Gonzalo", "Quispe", 39));
        padreList.add(new Padre(1, "Gerardo", "Valencia", "Quiños", 41));
        padreList.add(new Padre(2, "Alejandro", "Perez", "Garcia", 33));
        padreList.add(new Padre(3, "Diego", "Martinez", "Osorio", 29));
        padreList.add(new Padre(4, "Marcos", "Calderon", "Peralta", 36));

        List<Madre> madresList = new ArrayList<>();
        madresList.add(new Madre(5, "Maria", "Gomez", "Fernandez", 29));
        madresList.add(new Madre(1, "Ana", "Rodriguez", "Soto", 39));
        madresList.add(new Madre(2, "Laura", "Ramirez", "Morales", 22));
        madresList.add(new Madre(3, "Sofia", "Lopez", "Silva", 26));
        madresList.add(new Madre(4, "Isabel", "Sanchez", "Ortega", 28));

        int id = 5;
        List<Hijo> hijosList = new ArrayList<>();
        hijosList.add(new Hijo(5, "Dhenis", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 20));
        hijosList.add(new Hijo(1, "Andres", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 9));
        hijosList.add(new Hijo(5, "Dhenis2", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 10));
        hijosList.add(new Hijo(2, "Cristiano", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 2));
        hijosList.add(new Hijo(3, "Messi", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 21));
        hijosList.add(new Hijo(4, "Neymar", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 12));

        List<Hijo> hijosConMismoId = new ArrayList<>();
        for (Hijo hijo : hijosList) {
            if (hijo.getId() == id) {
                hijosConMismoId.add(hijo);
            }
        }
        for (Hijo hijo : hijosConMismoId) {
            System.out.println("=================PADRES===================");
            System.out.println("ID del hijo: " + hijo.getId());
            System.out.println("Nombre del hijo: " + hijo.getNombre());
            System.out.println("=================CANT_HIJOS===================");
            System.out.println("ID del hijo: " + hijo.getId());
            System.out.println("Nombre del hijo: " + hijo.getNombre());
            System.out.println("Apellido paterno: " + hijo.getApellido_p());
            System.out.println("Apellido materno: " + hijo.getApellido_m());
            System.out.println("Edad del hijo: " + hijo.getEdad());
            System.out.println("==========================================");
        }
    }
}
