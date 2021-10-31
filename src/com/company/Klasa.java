package com.company;

public class Klasa extends AbstractKlasa implements Interfejs  {

protected int drugi_broj=20;
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
}
