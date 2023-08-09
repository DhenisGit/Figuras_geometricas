package com.dhenis.polomorfismo;

public class Hija {
    private Integer id;
    private String nombre_hija;
    private String apellido_p;
    private String apellido_m;
    private Integer edad_hija;

    public Hija(Integer id, String nombre_hija, String apellido_p, String apellido_m, Integer edad_hija) {
        this.id = id;
        this.nombre_hija = nombre_hija;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.edad_hija = edad_hija;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_hija() {
        return nombre_hija;
    }

    public void setNombre_hija(String nombre_hija) {
        this.nombre_hija = nombre_hija;
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

    public Integer getEdad_hija() {
        return edad_hija;
    }

    public void setEdad_hija(Integer edad_hija) {
        this.edad_hija = edad_hija;
    }
}
