package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        final double PI_MATH=3.1415;
        Klasa klasa=new Klasa();
        System.out.println(klasa.broj);
        System.out.println(klasa.puta());
        System.out.println(klasa.sabiranje());
        System.out.println(klasa.manje());
        System.out.println(Klasa.ime);
        Klasa.myMethod(2,5);
//        System.out.println(Klasa.getIme().toUpperCase());
        System.out.println(Klasa.getIme().equalsIgnoreCase("ana"));
        System.out.println("To je "+ Klasa.ime.toUpperCase());

    }
}
