package com.company.lamda_expresions.predicate;

public class Main {

    public static void main(String[] args) {
        Predicate <Integer> p=integer ->  (integer>10);
        System.out.println(p.Test(20));
    }
}