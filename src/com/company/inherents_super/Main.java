package com.company.inherents_super;

public class Main {
    public static void main(String[] args) {
        OsnovnaKlasa osnovna=new OsnovnaKlasa("luka");
        NaslednaKlasa nasledna=new NaslednaKlasa("ana","adresa");
        PovratniRezultat povratni=new PovratniRezultat();

        osnovna.setBroj(10);

        System.out.println(osnovna.getBroj());
        System.out.println(nasledna.getAdresa());
        nasledna.setAdresa("trg");
        System.out.println(nasledna.mojaAdresa());
        System.out.println(povratni.probaMoja(2,50));
        StaticKlasa.staticna();
    }
    }

