package com.company.obicna;

public class StaticnaMetoda {

    public static String staticaPromenljiva;
    public static final double PI = 3.141592653589793;

    public static void StaticaMetoda(){
        System.out.println("Ovo je staticna metoda");
    }

    public StaticnaMetoda() {
    }

    public static String getStaticaPromenljiva() {
        return staticaPromenljiva;
    }

    public static void setStaticaPromenljiva(String staticaPromenljiva) {
        StaticnaMetoda.staticaPromenljiva = staticaPromenljiva;
    }

}
