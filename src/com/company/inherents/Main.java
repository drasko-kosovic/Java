package com.company.inherents;

public class Main {
    public static void main(String[] args) {
        OsnovnaKlasa osnovna=new OsnovnaKlasa("luka");
        NaslednaKlasa nasledna=new NaslednaKlasa("ana","adresa");
        osnovna.setBroj(10);
        System.out.println(osnovna.getBroj());
        System.out.println(nasledna.getAdresa());
        nasledna.setAdresa("trg");
        System.out.println(nasledna.mojaAdresa());

    }
    }

