package com.company.colekcija;

public class Main {


    public static void main(String[] args){
      Monitor monitor= new Monitor(458);
      Tastatura tastatura= new Tastatura("plava");
      PC pc= new PC(monitor,tastatura,"Assus",454);
        System.out.println(pc.getMarka_pc());
    }
}
