package com.company.LAMBDA.predicate1;

@FunctionalInterface
//Lambda bez argumenta
interface Cab{
    public void bookCab();
}
//Lambda sa argumentrima
@FunctionalInterface
interface CabArgumenat{
    public void bookCab(String pocetak,String kraj);
}



public class Test {
    public static void main(String[] args) {

        Cab cab=()-> System.out.println("Taksi je rezervisan");
        cab.bookCab();

        CabArgumenat cab_argument=(pocetak,kraj)-> System.out.println("Taksi krece od  "+pocetak+"    taksi vozi do  "+kraj);
        cab_argument.bookCab("Bulevar","Tuzi");
    }
}