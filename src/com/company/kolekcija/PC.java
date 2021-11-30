package com.company.kolekcija;

public class PC {

    private Monitor theMonitor;
    private Tastatura theTastatura;


    private String marka_pc;
    private int memorija;

    public boolean ugasen_pc() {
        return true;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public void setTheMonitor(Monitor theMonitor) {
        this.theMonitor = theMonitor;
    }

    public Tastatura getTheTastatura() {
        return theTastatura;
    }

    public void setTheTastatura(Tastatura theTastatura) {
        this.theTastatura = theTastatura;
    }

    public String getMarka_pc() {
        return marka_pc;
    }

    public void setMarka_pc(String marka_pc) {
        this.marka_pc = marka_pc;
    }

    public int getMemorija() {
        return memorija;
    }

    public void setMemorija(int memorija) {
        this.memorija = memorija;
    }

    public PC(Monitor theMonitor, Tastatura theTastatura, String marka_pc, int memorija) {
        this.theMonitor = theMonitor;
        this.theTastatura = theTastatura;
        this.marka_pc = marka_pc;
        this.memorija = memorija;
    }

    public PC() {
    }

    @Override
    public String toString() {
        return "PC{" +
                "theMonitor=" + theMonitor +
                ", theTastatura=" + theTastatura +
                ", marka_pc='" + marka_pc + '\'' +
                ", memorija=" + memorija +
                '}';
    }
}