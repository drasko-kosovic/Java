package com.company;

import com.company.abstraktna.AbstractKlasa;
import com.company.intefejs.Interfejs;

public class Klasa extends AbstractKlasa implements Interfejs {


    public static String ime="ana";
    @Override
    protected double puta() {
        return broj*20;
    }

    @Override
    public double manje() {
        return 111;
    }
    static void myMethod(int a, int b) {
        System.out.println(a*b);
    }


   static void varijabilniParametar(int ...X){

        for(int i:X)
       System.out.println(i);
    }



    public static String getIme() {
        return ime;
    }

    public static void main(String[] args) {
        varijabilniParametar(1,3,5);
    }
}
