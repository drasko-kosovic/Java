package com.company.lamda_expresions;
@FunctionalInterface
interface Cab {
    public void bookCab();
}

//class Ola implements Cab{

//
//    @Override
//    public void bookCab() {
//        System.out.println("Taksi je rezervisan");
//    }
//}

class Main{
    public static void main(String[] args) {
        Cab cab=()-> System.out.println("Taksi je rezervisan");
        cab.bookCab();
    }
}