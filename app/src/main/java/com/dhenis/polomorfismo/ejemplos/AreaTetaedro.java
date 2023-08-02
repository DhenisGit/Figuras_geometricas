package com.dhenis.polomorfismo.ejemplos;
public class AreaTetaedro {

    double logintud ;
    public AreaTetaedro(double logintud) {
        this.logintud = logintud;
    }

    public double getLogintud() {
        return logintud;
    }

    public void setLogintud(double logintud) {
        this.logintud = logintud;
    }

    public void calcularArea (){
        // Calcular el area del tetraedro
        // Math.pow = exponente
        // Math.sqrt = raíz cuadrada
        // Fórmula del area = (a^2 * √3)

        double area = (Math.pow(logintud, 2) * Math.sqrt(3));
        System.out.println("----------------RESULTADO------------------");
        System.out.println("El area del tetraedro regular es: " + area);
        System.out.println("-------------------------------------------");

    }








}
