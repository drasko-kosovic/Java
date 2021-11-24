package com.company.obicna;

public class Main {
    public static void main(String[] args) {

        Student<Student> student = new Student<>();
        student.setImeStudenta("Kosta");
        System.out.println("To je  " + student.getImeStudenta());
        student.Vrati();
        student.ObicnaMetodaApstraktneKlase();

        StudentMedicine<StudentMedicine> studentMedicine = new StudentMedicine<>();
        studentMedicine.setSpecijalizacija("Kardiolog");
        System.out.println(studentMedicine.getSpecijalizacija());

        StudentMedicine<StudentMedicine> studentMedicine1 = new StudentMedicine<>("Ocni", "Lazar");
        System.out.println(studentMedicine1.toString());

        StaticnaMetoda.StaticaMetoda();
        StaticnaMetoda.setStaticaPromenljiva("Staticna");
        System.out.println("Ovo je staticna promjenljiva  " + StaticnaMetoda.staticaPromenljiva);

        FinalClass finalClass = new FinalClass("Ratko");

    }
}
