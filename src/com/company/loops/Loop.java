package com.company.loops;

public class Loop {

    public static void main(String[] args) {

        for(int n=1;n<10;n++)
            System.out.println(n);

        int i=100;

        while (i<90) {
            System.out.println("While"  +i);
            i = i * 2;

        }

// mora se jedanput izvrsiti
        do{
            System.out.println("Do While  "+i);
            i = i * 2;
        }

        while (i<90);
        {
//            System.out.println(i);

        }
//        System.out.println("To je do while petlja  " +n);
    }





}

