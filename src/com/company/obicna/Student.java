package com.company.obicna;

public class Student<S> {

    String imeStudenta;

    public Student(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public Student() {
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }
}
