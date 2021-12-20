package com.company.overriding;

public class OverRiding {

    public static   class Tv{

       public void gasiTv()
       {
           System.out.println("Gasi supr klassa");
       }
    }
    public static class smartTv extends Tv{
        @Override
        public void gasiTv() {
            System.out.println( "Gasi sub klasa");
        }
        public void browse(){
            System.out.println("Brows");
        }


    }

    public static void main(String[] args) {
        Tv tv = new smartTv();
        tv.gasiTv();

    }
}
