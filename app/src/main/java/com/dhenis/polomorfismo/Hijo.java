package com.dhenis.polomorfismo;

public class Hijo {
    private int id;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private int edad;



    public Hijo(int id, String nombre, String apellido_p, String apellido_m, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.edad = edad;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}