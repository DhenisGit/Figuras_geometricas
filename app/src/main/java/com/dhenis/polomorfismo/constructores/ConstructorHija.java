package com.dhenis.polomorfismo;

public class datos_hija {
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String imageUrl;

    public datos_hija(Integer id, String nombre, String apellido_p, String apellido_m, Integer edad, String imageUrl) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellido_p;
        this.apellidoMaterno = apellido_m;
        this.edad = edad;
        this.imageUrl = imageUrl;
    }

    private int edad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_Hija() {
        return nombre;
    }

    public void setNombre_hija(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdadHija() {
        return edad;
    }

    public void setEdadHija(int edad) {
        this.edad = edad;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
