package com.company.obicna.polimorfizam;

public class Kombi extends Auto{

    public Kombi(int nosivost) {
        Nosivost = nosivost;
    }
    int Nosivost;
//Overloading
    public double Puta(double n1, double n2, double n3){
        return n1*n2*n3;
    }
}
