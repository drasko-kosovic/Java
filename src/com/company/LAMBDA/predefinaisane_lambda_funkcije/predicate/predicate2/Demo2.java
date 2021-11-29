package com.company.LAMBDA.predefinaisane_lambda_funkcije.predicate.predicate2;

import com.company.LAMBDA.predefinaisane_lambda_funkcije.predicate.Predicate;

import java.util.ArrayList;

class Zaposleni {
    String z_ime;
    int z_staz;
    int z_plata;

    public Zaposleni(String z_ime, int z_staz, int z_plata) {
        this.z_ime = z_ime;
        this.z_staz = z_staz;
        this.z_plata = z_plata;
    }

    public String getZ_ime() {
        return z_ime;
    }

    public void setZ_ime(String z_ime) {
        this.z_ime = z_ime;
    }

    public int getZ_staz() {
        return z_staz;
    }

    public void setZ_staz(int z_staz) {
        this.z_staz = z_staz;
    }

    public int getZ_plata() {
        return z_plata;
    }

    public void setZ_plata(int z_plata) {
        this.z_plata = z_plata;
    }
}
public class Demo2 {

    //Primjer 1
    public static void main(String[] args) {
        Zaposleni zaposleni=new Zaposleni("Kosta",15,1500);
       //Objekat je pr ubacujemo funkciju lambda :e->(e.z_plata>1000&&e.z_staz>10)
        Predicate<Zaposleni>pr=e->(e.z_plata>1000&&e.z_staz>10);
        System.out.println(pr.test(zaposleni));

        //Primjer 2

        ArrayList <Zaposleni> al=new ArrayList<>();
        al.add(new Zaposleni("Tom",25,2000));
        al.add(new Zaposleni("Marko",5,800));
        al.add(new Zaposleni("Veljko",12,500));
        for(Zaposleni x:al){
            if(pr.test(x))
                System.out.println("Ime je  "+x.z_ime+"  Plata je    "+x.z_plata+"    Staz je "+x.z_staz);
        }

    }




}
