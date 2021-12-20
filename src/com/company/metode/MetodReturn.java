package com.company.metode;

public class MetodReturn {


  public  int Uporedi(int x, int y) {
        return x > y ? x : y;
    }



    static String korisnik() {
        String mail = "drasko@gmail.com";
        int a = mail.indexOf('@');
        String user = mail.substring(0, a);
        return user;
    }



    public static void main(String[] args) {

//        String mail="drasko@gmail.com";
//        int a = mail.indexOf('@');
//        String user=mail.substring(0,a);
//        System.out.println(a);
//        System.out.println("Korisnik je  "+ user);
       MetodReturn mr=new MetodReturn();
        System.out.println(korisnik());
        System.out.println(mr.Uporedi(7,3));
    }
}
