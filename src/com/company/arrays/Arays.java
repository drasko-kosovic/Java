package com.company.arrays;


public class Arays {

    public static void main(String[] args) {
        int[] arry1 = new int[3];
        arry1[0] = 2;
        arry1[1] = 3;
        arry1[2] = 4;
        for (int i = 0; i < arry1.length; i++) {
            System.out.println("Treci element je   " + arry1[2]);
            System.out.println(arry1[i]);
            System.out.println(arry1.length);
        }

        int A[] = {1, 2, 3, 4};


        for (int array1 : A) {
            System.out.println("For Each Loop je   " + array1);
        }

    }
}
