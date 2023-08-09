package com.dhenis.polomorfismo;

public class Hijo {
    private Integer id;
    private String nombre_hijo;
    private String apellido_p;
    private String apellido_m;
    private Integer edad_hijo;

    public Hijo(Integer id, String nombre_hijo, String apellido_p, String apellido_m, Integer edad_hijo) {
        this.id = id;
        this.nombre_hijo = nombre_hijo;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.edad_hijo = edad_hijo;
    }

    public Hijo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_hijo() {
        return nombre_hijo;
    }

    public void setNombre_hijo(String nombre_hijo) {
        this.nombre_hijo = nombre_hijo;
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

    public Integer getEdad_hijo() {
        return edad_hijo;
    }

    public void setEdad_hijo(Integer edad_hijo) {
        this.edad_hijo = edad_hijo;
    }
}
