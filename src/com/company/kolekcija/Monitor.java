package com.company.kolekcija;

public class Monitor {

   private int broj_piksela;

   public void upaljen_monitor(){
       return ;
   }

    public int getBroj_piksela() {
        return broj_piksela;
    }

    public void setBroj_piksela(int broj_piksela) {
        this.broj_piksela = broj_piksela;
    }

    public Monitor() {
    }

    public Monitor(int broj_piksela) {
        this.broj_piksela = broj_piksela;
    }
}
