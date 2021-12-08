package com.company;

import com.company.abstraktna.AbstractKlasa;
import com.company.intefejs.Interfejs;

import java.util.Locale;

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

    public static String getIme() {
        return ime;
    }
}
