package com.company.generic;

import udemu.Player;

import java.util.ArrayList;

public class GenericClass {

//    public String ime;
//
//    public GenericClass(String ime) {
//        this.ime = ime;
//    }
//
//    public GenericClass() {
//    }

//    public String getIme() {
//        return ime;
//    }

    public void GenerikaMetoda() {
//        ArrayList<String> naziv = new ArrayList<>();
//        naziv.add("Luka");
//        naziv.add("Andrija");
//        naziv.add(0, "Petar");
//        for (String x : naziv) {
//            System.out.println(naziv);
//            System.out.println(naziv.contains("Luka"));
//        }
        Student marko=new Student("Kosta");
        ArrayList<Student> student = new ArrayList<>();
       student.add(0,
               marko);
        for(Student x:student)
            System.out.println(x);


    }




    public static void main(String[] args) {
        GenericClass generic = new GenericClass();
        generic.GenerikaMetoda();

    }
}
