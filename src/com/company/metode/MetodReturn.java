package com.company.metode;

public class MetodReturn {

  static String korisnik()
  {
      String mail="drasko@gmail.com";
      int a = mail.indexOf('@');
      String user=mail.substring(0,a);
      return user;
  }

    public static void main(String[] args) {

//        String mail="drasko@gmail.com";
//        int a = mail.indexOf('@');
//        String user=mail.substring(0,a);
//        System.out.println(a);
//        System.out.println("Korisnik je  "+ user);
        System.out.println(korisnik()) ;
    }
}
