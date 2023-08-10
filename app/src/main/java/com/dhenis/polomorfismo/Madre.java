package com.dhenis.polomorfismo;

public class Madre {
    private Integer id;
    private String nombre_madre;
    private String apellido_p_madre;
    private String apellido_m_madre;
    private Integer edad_madre;

    private String imageUrl_Madre;

    public Madre() {
    }

    public Madre(Integer id, String nombre_madre, String apellido_p_madre, String apellido_m_madre, Integer edad_madre, String imageUrl_Madre) {
        this.id = id;
        this.nombre_madre = nombre_madre;
        this.apellido_p_madre = apellido_p_madre;
        this.apellido_m_madre = apellido_m_madre;
        this.edad_madre = edad_madre;
        this.imageUrl_Madre = imageUrl_Madre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_madre() {
        return nombre_madre;
    }

    public void setNombre_madre(String nombre_madre) {
        this.nombre_madre = nombre_madre;
    }

    public String getApellido_p_madre() {
        return apellido_p_madre;
    }

    public void setApellido_p_madre(String apellido_p_madre) {
        this.apellido_p_madre = apellido_p_madre;
    }

    public String getApellido_m_madre() {
        return apellido_m_madre;
    }

    public void setApellido_m_madre(String apellido_m_madre) {
        this.apellido_m_madre = apellido_m_madre;
    }

    public Integer getEdad_madre() {
        return edad_madre;
    }

    public void setEdad_madre(Integer edad_madre) {
        this.edad_madre = edad_madre;
    }

    public String getImageUrl_Madre() {
        return imageUrl_Madre;
    }

    public void setImageUrl_Madre(String imageUrl_Madre) {
        this.imageUrl_Madre = imageUrl_Madre;
    }
}
