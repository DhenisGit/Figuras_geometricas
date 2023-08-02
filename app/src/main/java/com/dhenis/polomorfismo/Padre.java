package com.dhenis.polomorfismo;

import java.io.PipedReader;

public class Padre {
    private Integer id;
    private String nombre;
    private String apellido_p;
    private String apliido_m;
    private Integer edad;

    public Padre(){

    }

    public Padre(Integer id, String nombre, String apellidoP, String apliidoM, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        apellido_p = apellidoP;
        apliido_m = apliidoM;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApliido_m() {
        return apliido_m;
    }

    public void setApliido_m(String apliido_m) {
        this.apliido_m = apliido_m;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
