package com.dhenis.polomorfismo.ejemplos;

public class Hijo {
    private final double base;
    private final double altura;

    public Hijo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        double area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }

}
