package com.company.bill_burger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Burger burgers = new Burger();
        String hamburgers=burgers.getNameBurger();
        Scanner scener = new Scanner(System.in);
        System.out.println("Unesite vrstu hamburhera");
        hamburgers = scener.nextInt();
        switch (age) {
            case 1:
                System.out.println("Imate jednu godinu");
                break;
            case 2:
                System.out.println("imate dvije godine");
                break;
            default:
                System.out.println("Neznamo koliko imate godina");
                break;
        }


        ArrayList<Burger> hamburger = new ArrayList<>();
        hamburger.add((new Burger("Zdravi hamburger", 300)));
        for (Burger x : hamburger) {
            System.out.println("Naziv hamburgera je   " + x.nameBurger + "  Cijena " + x.price);

        }


        Burger burger = new Burger("Healthy", 120);
        System.out.println(burger.getNameBurger());

        Burger burger1 = new Burger();
        burger.setNameBurger("Meckdonalds");
        System.out.println(burger.getNameBurger());
    }
}


