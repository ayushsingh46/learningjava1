package com.ayyuusshh;

import java.util.Scanner;

public class conditionalsAndLoops {
    public static void main(String[] args) {
//    int sal = 24000;

        // if loop

//    if (sal > 10000 ){
//        sal = sal+2000;
//    }
//    else{
//        sal = sal + 1000;
//    }
//        System.out.println(sal);


//for loop

        //    for (int i = 0; i <= 10; i++) {
        //    System.out.println("hello");

//while loop

//        int i = 1;
//        while (i <= 34) {
//            System.out.print(i+ " ");
//            i = i + 1;


//do while loop

        //will execute atLeast once
//        int n = 0;
//        do {
//            System.out.println(n);
//            n++;
//        } while (n <= 20);


        //finding the largest number question
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b & c < b) {
            System.out.println("The greatest element is " + b);
        } else if (b < a & c < a) {
            System.out.println("THE greatest element is " + a);
        }
            else
            System.out.println("the greatest element is " + c);
        }
    }
