package com.company.obicna;

public class Student <S> extends AbstraktnaKlasa implements InterfajsKlassa{

    String imeStudenta;

    public Student(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public Student() {
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public void Vrati(){
        System.out.println("To je student sa imenom    "+ this.imeStudenta);
    }

    @Override
    public void AbstraktnaMetoda() {
        System.out.println("Implementacija abstraktne klase");
    }


    @Override
    public void InterfaceMetoda() {
        System.out.println("Ovo je interface Metoda");
    }
}
