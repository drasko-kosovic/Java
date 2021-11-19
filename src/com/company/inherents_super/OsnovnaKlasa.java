package com.company.inherents_super;

public class OsnovnaKlasa {

    private String ime;
    private int broj;

    public void puta(){
        System.out.println(this.broj*10);

    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public OsnovnaKlasa(String ime) {
        this.ime = ime;
        this.broj = 300;
    }

    public OsnovnaKlasa() {
    }
}
