package org.example.intefaces;

public class Cerc implements IFormaGeometrica{
    private double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    @Override
    public double calculeazaAria() {
        return Math.PI * raza * raza;
    }

    @Override
    public double calculeazaPerimetrul() {
        return 2 * Math.PI * raza;
    }
}
