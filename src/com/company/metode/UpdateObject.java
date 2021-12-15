package com.company.metode;

public class UpdateObject {

    static void Update(int A[])
    {
         A[0]=25;
    }

    public static void main(String[] args) {
        int A[]={2,5,8,7};
        Update(A);
        System.out.println(A[0]);
    }
}
