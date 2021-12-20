package com.company.super_this;

public class Super_this {

    int visina;
    int sirina;
    int x = 100;

    public Super_this(int visina, int sirina) {
        this.visina = visina;
        this.sirina = sirina;
    }

    public static class ChildClass extends Super_this {
        int dubina;
        int x;

        public ChildClass(int visina, int sirina, int dubina) {
            super(visina, sirina);
            this.dubina = 300;
            this.x = 500;
        }

        void display() {
            System.out.println(this.x);
            System.out.println(super.x);
        }
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass(12, 30, 5);
        childClass.display();
    }
}
