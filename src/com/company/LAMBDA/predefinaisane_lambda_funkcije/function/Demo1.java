package com.company.LAMBDA.predefinaisane_lambda_funkcije.function;

import java.util.function.Function;

public class Demo1 {

    public static void main(String[] args) {

        //Primjer 1
        Function<Integer,Integer> f=n->n*n;
        System.out.println(f.apply(5));
        System.out.println(f.apply(9));

//Primjer 2 uzima String parametar vraca Integer
        Function<String,Integer> fn=s -> s.length();
        System.out.println(fn.apply("Borisov"));






    }


}
