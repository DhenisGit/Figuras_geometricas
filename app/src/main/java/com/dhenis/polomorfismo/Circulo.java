package com.dhenis.polomorfismo;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del ciruclo es: " + area);
    }
    /*private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }*/
}
