package com.company.inherents_super;

public class NaslednaKlasa extends OsnovnaKlasa{

    private String adresa;

    public NaslednaKlasa() {

    }

    public NaslednaKlasa(String ime, String adresa) {
        super(ime);
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String mojaAdresa(){
        return this.adresa;
    }



}
