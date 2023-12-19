package org.example.encapsulation;

public class ContBancar {
    private double sold;

    public ContBancar(double soldInitial) {
        this.sold = soldInitial;
    }

    public double getSold() {
        return this.sold;
    }

    public void depune(double suma) {
        if(suma > 0) {
            this.sold += suma;
            System.out.println("Ati depus " + suma + "lei");
        } else {
            System.out.println("Suma depusa trebuie sa fie mai mare ca zero");
        }
    }

    public void retrage(double suma) {
        if(suma > 0 && suma <= sold) {
            this.sold -= suma;
            System.out.println("Retragere cu success");
        } else {
            System.out.println("Fonduri insuficiente!");
        }
    }
}
