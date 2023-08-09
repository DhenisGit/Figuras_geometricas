package com.dhenis.polomorfismo;


import android.content.Intent;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class Padres {
    private Integer id;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private Integer edad;
    private List<Hijo> hijos; // Nueva lista para almacenar los hijos del padre

    public Padres(Integer id, String nombre, String apellido_p, String apellido_m, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.edad = edad;
        this.hijos = new ArrayList<>(); // Inicializar la lista de hijos al crear el padre
    }

    public Padres() {
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

    // Método para agregar un hijo a la lista de hijos del padre
    public void agregarHijo(Hijo hijo) {
        hijos.add(hijo);
    }
}
