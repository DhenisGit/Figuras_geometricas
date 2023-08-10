package com.dhenis.polomorfismo.modelos;

public class Element {
    private Integer id;
    private String img;
    private String name;
    private String apellido_p;
    private String apellido_m;
    private Integer anos;
    private String puesto_laboral;
    private String resulta;

    public Element(Integer id, String img, String name, String apellido_p, String apellido_m, Integer anos, String puesto_laboral, String resulta) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.anos = anos;
        this.puesto_laboral = puesto_laboral;
        this.resulta = resulta;
    }

    public Element(Integer id, String img, String name, String apellido_p, String apellido_m, Integer anos) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.anos = anos;
    }

    public Element(Integer id, String img, String name, String apellido_p, String apellido_m) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public Integer getAnos() {
        return anos;
    }

    public void setAnos(Integer anos) {
        this.anos = anos;
    }

    public String getPuesto_laboral() {
        return puesto_laboral;
    }

    public void setPuesto_laboral(String puesto_laboral) {
        this.puesto_laboral = puesto_laboral;
    }

    public String getResulta() {
        return resulta;
    }

    public void setResulta(String resulta) {
        this.resulta = resulta;
    }
}
