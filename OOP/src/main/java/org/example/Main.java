package org.example;

import org.example.abstraction.Cerc;
import org.example.composition.Adresa;
import org.example.composition.Persoana;
import org.example.encapsulation.ContBancar;
import org.example.inheritance.Animal;
import org.example.inheritance.Caine;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persoana p = new Persoana("Costel");
        System.out.println(p.getNume());
        p.setNume("Viorel");
        System.out.println(p.getNume());

        Cerc c = new Cerc(200,100, 20);
        c.deseneaza();

        ContBancar contulLuiAndrei = new ContBancar(2000);
        contulLuiAndrei.depune(500);
        contulLuiAndrei.retrage(2800);

        Persoana mirel = new Persoana("Mirel", new Adresa("Calea Bucuresti", "Targu Jiu", "102323"));
        mirel.prezentare();

        Animal a = new Caine("Azorel");
        a.scoateSunete();

        Caine caine = new Caine("Bobita");
        caine.latra();
        caine.scoateSunete();
    }
}