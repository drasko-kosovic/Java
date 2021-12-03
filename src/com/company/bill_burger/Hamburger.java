package com.company.bill_burger;

public class Hamburger {

    String name;
    double price;
    String meat;
    String breadRollType;

    String addition1Name = name;
    double addition1Price = price;
    String addition2Name = name;
    double addition2Price = price;
    String addition3Name = name;
    double addition3Price = price;

    public Hamburger(String name, double price, String meat, String bredRollType) {
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.breadRollType = bredRollType;
    }

    public Hamburger() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getBredRollType() {
        return breadRollType;
    }

    public void setBredRollType(String bredRollType) {
        this.breadRollType = bredRollType;
    }

    public void addHamburger1Additional(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburger2Additional(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburger3Additional(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public double totalHamburgerPrice() {
        double hamburgerPrice = this.price;
        System.out.println("Name " + this.name);
        if (this.addition1Name!=null){
            hamburgerPrice+=this.addition1Price;
            System.out.println("Dodato je "+this.addition1Name+"Cijena dodatka je  "+this.addition1Price);

        }
        if (this.addition2Name!=null){
            hamburgerPrice+=this.addition2Price;
            System.out.println("Dodato je "+this.addition2Name);

        }
        return hamburgerPrice;
    }
}
