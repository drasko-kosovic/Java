package com.company.obicna;

public class StudentMedicine<S extends Student> extends Student{

    String specijalizacija;

    public StudentMedicine(String imeStudenta, String specijalizacija) {
        super(imeStudenta);
        this.specijalizacija = specijalizacija;
    }

    public StudentMedicine() {
    }

    public String getSpecijalizacija() {
        return specijalizacija;
    }

    public void setSpecijalizacija(String specijalizacija) {
        this.specijalizacija = specijalizacija;
    }

    @Override
    public String toString() {
        return "StudentMedicine{" +
                "imeStudenta='" + imeStudenta + '\'' +
                ", specijalizacija='" + specijalizacija + '\'' +
                '}';
    }
}
