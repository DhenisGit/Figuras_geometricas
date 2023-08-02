package com.dhenis.polomorfismo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.dhenis.polomorfismo.ejemplos.AreaTetaedro;
import com.dhenis.polomorfismo.ejemplos.Circulo;
import com.dhenis.polomorfismo.ejemplos.Cuadrado;
import com.dhenis.polomorfismo.ejemplos.Rectangulo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*===================CIRCULO====================================*/
        Circulo circulo = new Circulo(32, 3.14);
        System.out.println("Radio del circulo: " + circulo.getRadio());
        System.out.println("Valor del PI : " + circulo.getPi());
        Double pi = circulo.getPi();
        Integer radio = circulo.getRadio();
        Integer radio_cuadrado = radio * radio;
        Double resultado = radio_cuadrado * pi;
        System.out.println("El area del circulo es: " + resultado);
        /*=====================CUADRADO==================================*/
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
        /*=============================================================*/
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
        /*=============================================================*/
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
        /*========================RECTANGULO===============================*/
        Rectangulo rectangulo = new Rectangulo(10, 8);
        rectangulo.calcularArea();


        /*========================TETRAEDRO REGULAR ===============================*/
        /*======================  METODO GET ===============================*/
        AreaTetaedro areaTetaedro = new AreaTetaedro(7);

        double calcular = areaTetaedro.getLogintud();
        System.out.println("Valor: " + calcular);
        areaTetaedro.calcularArea();

        /*========================METODO SETTER ==============================*/
        areaTetaedro.setLogintud(5);
        double nuevoCalcular = areaTetaedro.getLogintud();
        System.out.println("Nuevo valorcito: " + nuevoCalcular);
        areaTetaedro.calcularArea();

    }
}