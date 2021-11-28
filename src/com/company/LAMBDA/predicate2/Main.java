package com.company.LAMBDA.predicate2;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> p = integer -> (integer > 10);
        System.out.println(p.test(5));
    }
}