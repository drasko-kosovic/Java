package com.company.lamda_expresions;
@FunctionalInterface
interface Cab {
//    public void bookCab();
    public void Puta(int a, int b);
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
//        Cab cab=()-> System.out.println("Taksi je rezervisan");
//        cab.bookCab();
        Cab cab = (a, b) -> System.out.println("To je a " + a + "  i b " + b);
        cab.Puta(3, 7);
    }
}