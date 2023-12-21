package org.example.intefaces;

public class Dreptunghi implements IFormaGeometrica{
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public double calculeazaAria() {
        return lungime * latime;
    }

    @Override
    public double calculeazaPerimetrul() {
        return 2 * (lungime + latime);
    }
}
