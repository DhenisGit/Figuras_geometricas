package com.dhenis.polomorfismo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.dhenis.polomorfismo.ejemplos.Circulo;
import com.dhenis.polomorfismo.ejemplos.Cuadrado;
import com.dhenis.polomorfismo.ejemplos.Rectangulo;
import com.dhenis.polomorfismo.ejemplos.Trapecio;
import com.dhenis.polomorfismo.listado.FatherActivity;
import com.dhenis.polomorfismo.listado.MatherActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_father;
    Button btn_mather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_father =findViewById(R.id.btn_father);
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