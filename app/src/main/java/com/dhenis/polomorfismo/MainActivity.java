package com.dhenis.polomorfismo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.dhenis.polomorfismo.ejemplos.Circulo;
import com.dhenis.polomorfismo.ejemplos.Cuadrado;
import com.dhenis.polomorfismo.ejemplos.Rectangulo;
import com.dhenis.polomorfismo.ejemplos.Trapecio;
import com.dhenis.polomorfismo.listado.FatherActivity;
import com.dhenis.polomorfismo.listado.MatherActivity;
import com.dhenis.polomorfismo.modelos.Father;
import com.dhenis.polomorfismo.modelos.Mather;
import com.dhenis.polomorfismo.modelos.Son;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btn_father;
    Button btn_mather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_father = findViewById(R.id.btn_father);
        btn_mather = findViewById(R.id.btn_mather);

        btn_father.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FatherActivity.class));

            }
        });

        btn_mather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MatherActivity.class));

            }
        });

        /*=====================================FATHER==============================================================================*/

        List<Father> fatherList = new ArrayList<>();
        fatherList.add(new Father(0, "Diego", "Mendoza", "Chavez", 41, "Limpieza", "C"));
        fatherList.add(new Father(1, "Eddie", "Elvon", "Carrion", 55, "Administrador", "C"));
        fatherList.add(new Father(2, "Luis", "Molina", "Lopez", 41, "Programador", "C"));
        fatherList.add(new Father(3, "Lazlo", "Escobar", "Perez", 41, "Asistente", "C"));
        fatherList.add(new Father(4, "Efrain", "Malca", "Mendez", 41, "Secretario", "C"));
        fatherList.add(new Father(5, "Edgar", "Periera", "LaLo", 41, "Futbolista", "C"));
        fatherList.add(new Father(6, "Cesar", "Messi", "Centuron", 41, "Psicólogo", "C"));
        fatherList.add(new Father(7, "Jorge", "Kovaks", "Horna", 41, "Doctor", "C"));
        fatherList.add(new Father(8, "Mario", "Gonsalez", "Culon", 41, "Maestro", "C"));
        fatherList.add(new Father(9, "Jhon", "Besso", "Ormeño", 41, "Arquitecto", "C"));
        fatherList.add(new Father(10, "Dhenis", "Burgos", "Aguado", 41, "Gerente", "C"));
        fatherList.add(new Father(11, "Jhonatan", "Huaman", "Ambrosio", 41, "Vendedor", "D"));
        fatherList.add(new Father(12, "Israel", "Salinas", "Titto", 41, "Pescador", "S"));
        fatherList.add(new Father(13, "Marcos", "Quiroz", "Catalan", 41, "Conductor", "D"));

        /*====================================MATHER==============================================================================*/

        List<Mather> matherList = new ArrayList<>();
        matherList.add(new Mather(0, "Luz", "Medina", "Quiroz", 34, "Secretaria", "C"));
        matherList.add(new Mather(1, "Lucia", "Corzo", "Plata", 34, "Limpieza", "C"));
        matherList.add(new Mather(2, "JImena", "Diaz", "Chong", 34, "Abogada", "C"));
        matherList.add(new Mather(3, "Lizbeth", "Fernandez", "Banega", 34, "Gerente", "C"));
        matherList.add(new Mather(4, "Deysi", "Torres", "Milito", 34, "Doctora", "C"));
        matherList.add(new Mather(5, "Manuela", "Ramiro", "Lopez", 34, "Veterinaria", "C"));
        matherList.add(new Mather(6, "Alma", "Baltodano", "Vargas", 34, "Podologa", "C"));
        matherList.add(new Mather(7, "Emely", "Malca", "Guerrero", 34, "Contabilidad", "C"));
        matherList.add(new Mather(8, "Jessica", "Huella", "Hurtado", 34, "Ingeniera", "C"));
        matherList.add(new Mather(9, "Nore", "Ballon", "Vivar", 34, "Operadora", "C"));
        matherList.add(new Mather(10, "Sara", "Sicado", "Gallese", 34, "Mesera", "C"));
        matherList.add(new Mather(11, "Maria", "Espinoza", "Ramos", 34, "Chef", "D"));
        matherList.add(new Mather(12, "Rosa", "Carbon", "Santimaria", 34, "Asesora", "S"));
        matherList.add(new Mather(13, "Ana", "Teros", "Callens", 34, "RR.HH", "D"));

        /*============================SON==========================================================================================*/

        int id = 0;
        id = fatherList.get(id).getId();
        List<Son> sonList = new ArrayList<>();
        sonList.add(new Son(0, "Edson", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 21, "Abogado", "S"));
        sonList.add(new Son(1, "Lula", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 6, "Abogado", "S"));
        sonList.add(new Son(2, "Marcos", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 10, "Abogado", "S"));
        sonList.add(new Son(3, "Fabiola", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 2, "Abogado", "S"));
        sonList.add(new Son(4, "Eddie", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 5, "Abogado", "S"));
        sonList.add(new Son(5, "Erika", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 18, "Abogado", "S"));
        sonList.add(new Son(6, "Allison", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 9, "Abogado", "S"));
        sonList.add(new Son(7, "Martha", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 24, "Abogado", "S"));
        sonList.add(new Son(8, "Jade", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 7, "Abogado", "S"));
        sonList.add(new Son(9, "0scar", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 12, "Abogado", "S"));
        sonList.add(new Son(10, "Alex", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 8, "Abogado", "S"));
        sonList.add(new Son(11, "Diego", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 1, "Abogado", "S"));
        sonList.add(new Son(12, "Victoria", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 17, "Abogado", "S"));
        sonList.add(new Son(13, "Josefina", fatherList.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 16, "Abogado", "S"));

        /*==================================================================================================================================*/

        System.out.println("==========================================");
        System.out.println("ID del hijo: " + sonList.get(id).getId());
        System.out.println("Nombre del hijo: " + sonList.get(id).getNombre());
        System.out.println("Apellido paterno: " + sonList.get(id).getApellido_p());
        System.out.println("Apellido materno: " + sonList.get(id).getApellido_m());
        System.out.println("Edad del hijo: " + sonList.get(id).getEdad());
        System.out.println("==========================================");

        /*===================TRAPECIO====================================*/

//        Trapecio trapecio = new Trapecio(10, 7, 3);
//
//        Integer b = trapecio.getB();
//        System.out.println("Valor b: " + b);
//        Integer C = trapecio.getC();
//        System.out.println("Valor C: " + C);
//        Integer h = trapecio.getH();
//        System.out.println("Valor h: " + h);
//
//        Integer resultado_trapecio = (b + C) * h;
//        Double resultado_total = (double) (resultado_trapecio / 5);
//
//        System.out.println("Total de A: " + resultado_total);

        /*=================================================================*/
/*
        System.out.println("=======================================");

        trapecio.setB(5);
        trapecio.setC(2);
        trapecio.setH(9);

        Integer b_1 = trapecio.getB();
        Integer C_2 = trapecio.getC();
        Integer h_3 = trapecio.getH();

        System.out.println("El valor de b:" + b_1);
        System.out.println("El valor de b:" + C_2);
        System.out.println("El valor de b:" + h_3);

        Integer resultafo_trepae1 = (b_1 + C_2) * h_3;
        Integer resultado_final = (resultafo_trepae1 / 8);

        System.out.println("Total de set:" + resultado_final);*/

        /*===============================================================*/
        /*===================CIRCULO====================================*/
        /*Circulo circulo = new Circulo(32, 3.14);
        System.out.println("Radio del circulo: " + circulo.getRadio());
        System.out.println("Valor del PI : " + circulo.getPi());
        Double pi = circulo.getPi();
        Integer radio = circulo.getRadio();
        Integer radio_cuadrado = radio * radio;
        Double resultado = radio_cuadrado * pi;
        System.out.println("El area del circulo es: " + resultado);
        *//*=====================CUADRADO==================================*//*
        Cuadrado cuadrado = new Cuadrado(20, 150);
        Integer lado1 = cuadrado.getLado1();
        Integer lado2 = cuadrado.getLado2();
        System.out.println("=======================");
        System.out.println("Lado1: " + lado1);
        System.out.println("Lado2: " + lado2);
        System.out.println("=======================");
        Integer resultado1 = lado1 * lado2;
        System.out.println("=================================");
        System.out.println("El resultado es: " + resultado1);
        System.out.println("=================================");
        *//*=============================================================*//*
        cuadrado.setLado1(5);
        cuadrado.setLado2(15);
        System.out.println("=======================");
        Integer primer_lado = cuadrado.getLado1();
        Integer segundo_lado = cuadrado.getLado2();
        System.out.println("Lado1: " + primer_lado);
        System.out.println("Lado2: " + segundo_lado);
        System.out.println("=======================");
        Integer resultado2 = primer_lado * segundo_lado;
        System.out.println("=================================");
        System.out.println("El resultado es: " + resultado2);
        System.out.println("=================================");
        *//*=============================================================*//*
        cuadrado.setLado1(10);
        cuadrado.setLado2(10);
        System.out.println("=======================");
        Integer lado_1 = cuadrado.getLado1();
        Integer lado_2 = cuadrado.getLado2();
        System.out.println("Lado1: " + lado_1);
        System.out.println("Lado2: " + lado_2);
        Integer resultado3 = lado_1 * lado_2;
        System.out.println("=================================");
        System.out.println("El resultado es: " + resultado3);
        System.out.println("=================================");
        *//*========================RECTANGULO===============================*//*
        Rectangulo rectangulo = new Rectangulo(10, 8);
        rectangulo.calcularArea();
    }
}*/
    }
}