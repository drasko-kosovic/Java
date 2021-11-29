package com.company.LAMBDA.predefinaisane_lambda_funkcije.predicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //Primjer 1 Integer
        Predicate<Integer> p = integer -> (integer > 10);
        System.out.println(p.test(5));

       //Primjer 2 string
        Predicate<String> pr=s->(s.length()>4);
        System.out.println(pr.test("Dobrodosao"));

        //Primjer 3 Array pokazuje samo imana koja imaju vise od 4 slova

        String imena[]= {"Adam","Marko","Boris"};

        for(String x:imena)
        {
            if (pr.test(x))
            System.out.println("To su imena   "+ x);
        }


        }
}