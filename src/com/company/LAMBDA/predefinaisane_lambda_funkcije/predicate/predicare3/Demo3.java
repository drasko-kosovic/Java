package com.company.LAMBDA.predefinaisane_lambda_funkcije.predicate.predicare3;

import java.util.function.Predicate;
/*Prvo probamo jeli broj u nizu paran
Drugo koji je broj veci od 50
*/
public class Demo3 {
    public static void main(String[] args) {
        int a[]={5,10,15,20,25,60};
//        //Primjer 1
        Predicate<Integer>p1=i->i%2==0;
//        for(Integer x:a){
//            if(p1.test(x))
//            System.out.println(x);
//        }
//        System.out.println("_____________________________ veci od 50");
//        //Primjer 2 koji je broj veci od 50
        Predicate<Integer>p2=i->i>50;
//        for(Integer x:a){
//            if(p2.test(x))
//                System.out.println(x);
//        }

        for(Integer x:a){
            if(p1.test(x)&&p2.test(x))
                System.out.println(x);
        }

    }






}
