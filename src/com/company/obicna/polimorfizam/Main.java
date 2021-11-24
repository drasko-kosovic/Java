package com.company.obicna.polimorfizam;

public class Main {
    public static void main(String[] args) {

        Auto auto=new Auto();
        Kombi kombi=new Kombi(20);
        kombi.setBoja("Plava");
        Auto poliformizam=new Kombi(30);
        System.out.println(poliformizam.Puta(5,9));
        System.out.println(kombi.boja);
    }
}
