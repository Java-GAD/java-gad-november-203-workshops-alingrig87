package org.example.overloading;

public class Calculator {
    public int aduna(int a, int b) {
        return a + b;
    }

    public int aduna(int a, int b, int c) {
        return a + b + c;
    }

    public double aduna(double d1, double d2) {
        return d1 + d2;
    }

    public double aduna(double d1, int a) {
        return d1 + a;
    }
}
