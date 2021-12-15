package com.company.metode;

public class Metode {

//    static int max(int x, int y) {
//        if (x > y)
//            return x;
//        else return y;
//    }
//
//    public static void main(String[] args) {
//        int a = 12;
//        int b = 7;
//        int c;
//        System.out.println(max(a, b));
//
//    }

     int max(int x, int y) {
        if (x > y)
            return x;
        else return y;
    }
 static  void inc(int x){
         x++;
        System.out.println("To je "+x);
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 77;
        int c;

        Metode metode=new Metode();
        System.out.println(metode.max(a, b));

        inc(a);
        System.out.println(a);

    }


}
