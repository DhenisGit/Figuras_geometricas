package com.dhenis.polomorfismo;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Figura figura = new Figura();
        Figura figura1 = new Circulo(5.20);
        Figura figura2 = new Rectangulo(10, 20);
        System.out.println("================================");
        figura.calcularArea();
        figura1.calcularArea();
        figura2.calcularArea();
        System.out.println("================================");
       /* // Crear instancias de las figuras geométricas
        Figura2 circulo = new Circulo(5.0);
        Figura2 cuadrado = new Cuadrado(4.0);
        // Calcular y mostrar el área
        double areaCirculo = circulo.calcularArea();
        double areaCuadrado = cuadrado.calcularArea();
        Toast.makeText(this, "Área del círculo: " + areaCirculo, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Área del cuadrado: " + areaCuadrado, Toast.LENGTH_SHORT).show();*/
    }
}