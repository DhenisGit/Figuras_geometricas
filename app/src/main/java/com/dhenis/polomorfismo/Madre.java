package com.dhenis.polomorfismo;

public class Madre {
    private Integer id;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private Integer edad;

    public Madre(Integer id, String nombre, String apellido_p, String apellido_m, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
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

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
