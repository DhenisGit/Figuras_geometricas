package com.dhenis.polomorfismo.modelos;

public class ListElement {
    private String img;
    private String name;
    private String apellido_p;
    private String apellido_m;
    private String puesto_laboral;
    private Integer anos;
    private String resulta;

    public ListElement(String img, String name, String apellido_p, String apellido_m, String puesto_laboral, Integer anos, String resulta) {
        this.img = img;
        this.name = name;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.puesto_laboral = puesto_laboral;
        this.anos = anos;
        this.resulta = resulta;
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

    public String getPuesto_laboral() {
        return puesto_laboral;
    }

    public void setPuesto_laboral(String puesto_laboral) {
        this.puesto_laboral = puesto_laboral;
    }

    public Integer getAnos() {
        return anos;
    }

    public void setAnos(Integer anos) {
        this.anos = anos;
    }

    public String getResulta() {
        return resulta;
    }

    public void setResulta(String resulta) {
        this.resulta = resulta;
    }
}
