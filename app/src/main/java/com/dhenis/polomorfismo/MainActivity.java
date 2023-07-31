package com.dhenis.polomorfismo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.dhenis.polomorfismo.polimorfismo.Animal;
import com.dhenis.polomorfismo.polimorfismo.Cat;
import com.dhenis.polomorfismo.polimorfismo.Dog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*List<Padre> padreList = new ArrayList<>();
        padreList.add(new Padre(0, "German", "Gonzalo", "Quispe", 39));
        padreList.add(new Padre(1, "Gerardo", "Valencia", "Quiños", 41));
        padreList.add(new Padre(2, "Alejandro", "Perez", "Garcia", 33));
        padreList.add(new Padre(3, "Diego", "Martines", "Osorio", 29));
        padreList.add(new Padre(4, "Marcos", "Calderon", "Peralta", 36));

        List<Madre> madresList = new ArrayList<>();
        madresList.add(new Madre(0, "Maria", "Gomez", "Fernandez", 29));
        madresList.add(new Madre(1, "Ana", "Rodriguez", "Soto", 39));
        madresList.add(new Madre(2, "Laura", "Ramirez", "Morales", 22));
        madresList.add(new Madre(3, "Sofia", "Lopez", "Silva", 26));
        madresList.add(new Madre(4, "Isabel", "Sanchez", "Ortega", 28));

        int id = 1;
        id = padreList.get(id).getId();
        List<Hijo> hijosList = new ArrayList<>();
        hijosList.add(new Hijo(0, "Dhenis", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 20));
        hijosList.add(new Hijo(1, "Andres", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 9));
        hijosList.add(new Hijo(2, "Cristiano", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 2));
        hijosList.add(new Hijo(3, "Messi", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 21));
        hijosList.add(new Hijo(4, "Neymar", padreList.get(id).getApellido_p(), madresList.get(id).getApellido_p(), 12));
        System.out.println("==========================================");
        System.out.println("ID del hijo: " + hijosList.get(id).getId());
        System.out.println("Nombre del hijo: " + hijosList.get(id).getNombre());
        System.out.println("Apellido paterno: " + hijosList.get(id).getApellido_p());
        System.out.println("Apellido materno: " + hijosList.get(id).getApellido_m());
        System.out.println("Edad del hijo: " + hijosList.get(id).getEdad());
        System.out.println("==========================================");*/
        Animal a = new Cat();
        a.makeSound();
        Animal b = new Dog();
        b.makeSound();

    }
}
