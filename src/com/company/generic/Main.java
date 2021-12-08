package com.company.generic;

import java.util.ArrayList;

public class Main {

    public void GenerikaMetoda() {
//        Student marko=new Student("Kosta");
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("Petar"));
        for(Student x:student)
            System.out.println(x.getImeStudenta());


    }




    public static void main(String[] args) {
        Main generic = new Main();
        generic.GenerikaMetoda();

    }
}
