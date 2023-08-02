package com.dhenis.polomorfismo.ejemplos;

public class Persona {
    public String color;
    public String nombre;
    public String puesto;
    public String edad;
    public String estadocivil;

    public Persona(String color, String nombre, String puesto, String edad, String estadocivil) {
        this.color = color;
        this.nombre = nombre;
        this.puesto = puesto;
        this.edad = edad;
        this.estadocivil = estadocivil;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }
}