package org.example.abstraction;

abstract class FormaGeometrica {
    int x,y;

    public FormaGeometrica(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract void deseneaza();
}


