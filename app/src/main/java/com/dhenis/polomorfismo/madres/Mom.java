package com.dhenis.polomorfismo.madres;

public class Mom {
    Integer id;
    String image_url;
    String name;
    String apellido_p;
    String apellido_m;
    String puesto_laboral;
    Integer edad;
    String estado_civil;

    public Mom(Integer id, String image_url, String name, String apellido_p, String apellido_m, String puesto_laboral, Integer edad, String estado_civil) {
        this.id = id;
        this.image_url = image_url;
        this.name = name;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.puesto_laboral = puesto_laboral;
        this.edad = edad;
        this.estado_civil = estado_civil;
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

    public String getPuesto_laboral() {
        return puesto_laboral;
    }

    public void setPuesto_laboral(String puesto_laboral) {
        this.puesto_laboral = puesto_laboral;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
}
