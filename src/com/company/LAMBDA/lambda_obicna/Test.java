package com.company.LAMBDA.lambda_obicna;

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

@FunctionalInterface
interface CabArgumenatString{
    public String bookCab(String pocetak,String kraj);
}



public class Test {
    public static void main(String[] args) {

        Cab cab=()-> System.out.println("Taksi je rezervisan");
        cab.bookCab();

        CabArgumenat cab_argument=(pocetak,kraj)-> System.out.println("Taksi krece od  "+pocetak+"    taksi vozi do  "+kraj);
        cab_argument.bookCab("Bulevar","Tuzi");

        // Lambda sa argumetm i povratnim tipom String
        CabArgumenatString cab_argument_sting=(pocetak,kraj)->{ System.out.println("Taksi krece od  "+pocetak+"    taksi vozi do  "+kraj);
        return ("Cijena je 5000 eura");
        };
        System.out.println(cab_argument_sting.bookCab("Vezirov most  ","Zagoric"));

    }
}