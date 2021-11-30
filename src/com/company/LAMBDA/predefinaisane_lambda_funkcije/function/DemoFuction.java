package com.company.LAMBDA.predefinaisane_lambda_funkcije.function;

import com.company.LAMBDA.predefinaisane_lambda_funkcije.predicate.predicate2.Zaposleni;

import java.util.ArrayList;

import java.util.function.Function;

public class DemoFuction {

    public static void main(String[] args) {

        ArrayList<Zaposleni>zaposleni=new ArrayList<>();
        zaposleni.add(new Zaposleni("Drasko",10,2000));
        zaposleni.add(new Zaposleni("Vesko",20,5000));

        //Primjer 1
        Function<Integer,Integer> f=n->n*n;
        System.out.println(f.apply(5));
        System.out.println(f.apply(9));

        //Primjer 2 uzima String parametar vraca Integer
        Function<String,Integer> fn=s -> s.length();
        System.out.println(fn.apply("Borisov"));
        // Primjer 3
        Function<Zaposleni,Integer>function=zap -> (zap.getZ_plata()*10)/100;
for(Zaposleni x:zaposleni ){

    System.out.println(function.toString());
}

    }


}