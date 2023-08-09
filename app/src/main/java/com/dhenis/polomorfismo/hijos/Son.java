package com.dhenis.polomorfismo.hijos;

public class Son {
    Integer id;
    String image_url;
    String name;
    String apellido_p;
    String apellido_m;
    Integer edad;

    public Son(Integer id, String image_url, String name, String apellido_p, String apellido_m, Integer edad) {
        this.id = id;
        this.image_url = image_url;
        this.name = name;
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

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
