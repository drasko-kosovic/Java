package com.company.bill_burger;

import java.util.Scanner;

public class Burger {

    String nameBurger;
    double price;

    public Burger(String nameBurger, double price) {
        this.nameBurger = nameBurger;
        this.price = price;
    }

    public Burger() {
    }

    public String getNameBurger() {
        return nameBurger;
    }

    public void setNameBurger(String nameBurger) {
        this.nameBurger = nameBurger;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
