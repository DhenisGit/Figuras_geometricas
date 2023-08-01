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

        // Creación de la lista de objetos Padre que contiene información sobre los padres.
        List<Padre> padreList = new ArrayList<>();
        padreList.add(new Padre(1, "German", "Gonzalo", "Quispe", 39));
        padreList.add(new Padre(2, "Gerardo", "Valencia", "Quiños", 41));
        padreList.add(new Padre(3, "Alejandro", "Perez", "Garcia", 33));
        padreList.add(new Padre(4, "Diego", "Martinez", "Osorio", 29));
        padreList.add(new Padre(5, "Marcos", "Calderon", "Peralta", 36));

        // Creación de la lista de objetos Madre que contiene información sobre las madres.
        List<Madre> madresList = new ArrayList<>();
        madresList.add(new Madre(1, "Maria", "Gomez", "Fernandez", 29));
        madresList.add(new Madre(2, "Ana", "Rodriguez", "Soto", 39));
        madresList.add(new Madre(3, "Laura", "Ramirez", "Morales", 22));
        madresList.add(new Madre(4, "Sofia", "Lopez", "Silva", 26));
        madresList.add(new Madre(5, "Isabel", "Sanchez", "Ortega", 28));

        // Definición del id de padre para buscar los hijos relacionados con ese id.
        int id = 1;
        // Creación de la lista de objetos Hijo que contiene información sobre los hijos.
        List<Hijo> hijosList = new ArrayList<>();
        hijosList.add(new Hijo(1, "Dhenis", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 20));
        hijosList.add(new Hijo(1, "Dhenis2", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 10));
        hijosList.add(new Hijo(2, "Andres", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 9));
        hijosList.add(new Hijo(3, "Cristiano", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 2));
        hijosList.add(new Hijo(4, "Messi", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 21));
        hijosList.add(new Hijo(5, "Neymar", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 12));

        // Creación de la lista de objetos Hijo que almacenará los hijos con el mismo id especificado.
        List<Hijo> hijosConMismoId = new ArrayList<>();
        // Bucle for-each para filtrar los hijos que tienen el mismo id que el valor almacenado en la variable id.
        for (Hijo hijo : hijosList) {
            if (hijo.getId() == id) {
                hijosConMismoId.add(hijo);
            }
        }
        // Impresión de la información del padre y la madre correspondientes al id especificado.
        System.out.println("=================PADRES===================");
        System.out.println("Nombre completo del padre: " + padreList.get(id).getNombre() + " " + padreList.get(id).getApellido_p() + " " + padreList.get(id).getApellido_m());
        System.out.println("Nombre completo de la madre: " + madresList.get(id).getNombre() + " " + madresList.get(id).getApellido_p() + " " + madresList.get(id).getApellido_m());
        // Impresión de la información de los hijos que tienen el mismo id que el valor almacenado en la variable id.
        for (Hijo hijo : hijosConMismoId) {
            System.out.println("=================CANT_HIJOS===================");
            System.out.println("ID del hijo: " + hijo.getId());
            System.out.println("Nombre del hijo: " + hijo.getNombre());
            System.out.println("Apellido paterno: " + hijo.getApellido_p());
            System.out.println("Apellido materno: " + hijo.getApellido_m());
            System.out.println("Edad del hijo: " + hijo.getEdad());
        }
        System.out.println("==========================================");
    }
}
