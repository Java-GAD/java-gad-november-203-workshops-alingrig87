package org.example.composition;

public class Adresa {
    private String strada;
    private String oras;
    private String codPostal;

    public Adresa(String strada, String oras, String codPostal) {
        this.strada = strada;
        this.oras = oras;
        this.codPostal = codPostal;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getStrada() {
        return strada;
    }

    public String getOras() {
        return oras;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public String getAdresaCompleta() {
        return "strada: " + strada + " oras: " + oras + " cod postal: " + codPostal;
    }
}