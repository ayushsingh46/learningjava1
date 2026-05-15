package com.ayyuusshh;

import java.util.Scanner;

public class casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        System.out.println("num is "+num);

        //TYPE CASTING
        int num = (int)(67.89f);
        System.out.println(num);

        //automatic type promotion in expression
        int a = 256;
        byte b= (byte)(a);
        System.out.println(b);

        //as java uses askai numbers
        int number = 'A';
        System.out.println(number);
    }
}
