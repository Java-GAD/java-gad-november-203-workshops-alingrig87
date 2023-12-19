package org.example.composition;

public class Persoana {
    private String nume;
    private Adresa adresa;

    public Persoana(String nume) {
        this.nume = nume;
    }

    public Persoana(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void prezentare() {
        System.out.println("Ma numesc " + nume + " si locuiesc la adresa: " + adresa.getAdresaCompleta());
    }
}

