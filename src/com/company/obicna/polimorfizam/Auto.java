package com.company.obicna.polimorfizam;

public class Auto {

    String naziv;
    String boja;
    int brojVrata;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public boolean Start(){
        System.out.println("Auto je krenuo");
        return false;
    }
//    Primjer Overloading
    public int Puta(int n1, int n2){
        return n1*n2;
    }



}
