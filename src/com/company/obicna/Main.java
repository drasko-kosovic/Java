package com.company.obicna;

public class Main {
    public static void main(String[] args) {

        Student<Student> student=new Student<>();
        student.setImeStudenta("Kosta");
        System.out.println("To je  "+ student.getImeStudenta());
    }
}
