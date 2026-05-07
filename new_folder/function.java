package com.ayyuusshh;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
    //int ans = sum2();
      //  System.out.println("The sum is "+ ans);

        int ans = sum3(23,23);
        System.out.println(ans);
    }

    //pass the value of the numbers when you are calling the method in the main()
     static int sum3(int a, int b){
        int sum = a+b;
        return sum;
     }

    //return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number hehe: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number haha: ");
        int num2 = sc.nextInt();
        return num1+num2;
    }
   static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.println("The sum is "+ sum);
    }
}
