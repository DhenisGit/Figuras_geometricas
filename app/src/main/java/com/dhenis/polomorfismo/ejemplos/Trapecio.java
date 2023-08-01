package com.dhenis.polomorfismo.ejemplos;

public class Trapecio {
    Integer b;
    Integer C;
    Integer h;

    public Trapecio() {
    }

    public Trapecio(Integer b, Integer C, Integer h) {
        this.b = b;
        this.C = C;
        this.h = h;

    }

    public void setB(Integer b) {
        this.b = b;
    }

    public void setC(Integer c) {
        C = c;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getB() {
        return b;
    }

    public Integer getC(){
        return C;
    }

    public Integer getH() {
        return h;
    }
}
