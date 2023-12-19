package org.example.abstraction;

public class Cerc extends FormaGeometrica {
    int raza;

    public Cerc(int x, int y, int raza) {
        super(x, y);
        this.raza = raza;
    }

    public void deseneaza() {
        System.out.println("Deseneaza cerc la coordonatele " + " x = " +  x + " y = " + y + " cu raza = " + raza);
    }
}