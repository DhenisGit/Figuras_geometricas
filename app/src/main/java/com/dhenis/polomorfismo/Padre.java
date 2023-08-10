package com.dhenis.polomorfismo;

public class Padre {
    private Integer id;
    private String nombre;
    private String apellido_p;
    private String apliido_m;
    private Integer edad;
    private String imageUrl;

    public Padre(){

    }

    public Padre(Integer id, String nombre, String apellido_p, String apliido_m, Integer edad, String imageUrl) {
        this.id = id;
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apliido_m = apliido_m;
        this.edad = edad;
        this.imageUrl = imageUrl;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
