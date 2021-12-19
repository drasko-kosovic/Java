package com.company.switchcase;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

//        int day = 12;
        System.out.println("Izaberite dan");
        Scanner scanner=new Scanner(System.in);
        int day =scanner.nextInt();
        switch (day) {
            case 2:
                System.out.println("Utorak");
                break;
            default:
                System.out.println("Niste izabrali dobar dan");
        }


    }



}
