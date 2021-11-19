package com.company.inner;

public class InerKlasa {


           public void ispisGlavne(){
            System.out.println("neki ispis glavne klase");
        }


        public class UgnjezednaKlasa{
            public void ispisUgnjrzdene(){
                System.out.println("neki ispis ugnjedene klase");
            }
        }

    public static void main(String[] args){
       InerKlasa glavna= new InerKlasa();
       glavna.ispisGlavne();
       InerKlasa.UgnjezednaKlasa ugnjezdena=glavna.new UgnjezednaKlasa();
       ugnjezdena.ispisUgnjrzdene();

    }
}




