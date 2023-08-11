package com.dhenis.polomorfismo;
public class datos_madre {
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;


    public datos_madre(Integer id, String nombre, String apellido_p, String apellido_m, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellido_p;
        this.apellidoMaterno = apellido_m;
        this.edad = edad;
    }

    private int edad;

    public int getIdMadre() {
        return id;
    }

    public void setIdMadre(int id) {
        this.id = id;
    }

    public String getNombreMadre() {
        return nombre;
    }

    public void setNombreMadre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno_Madre() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno_Madre() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno_Madre(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad_Madre() {
        return edad;
    }

    public void setEdad_Madre(int edad) {
        this.edad = edad;
    }
}
