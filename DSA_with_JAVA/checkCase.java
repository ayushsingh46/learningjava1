package com.ayyuusshh;

import java.util.Scanner;

public class checkCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ok = sc.next().trim().charAt(0);
          if (ok>= 'a' && ok<= 'z') {
              System.out.println("THE CASES ARE IN LOWER CASE");
          }else{
              System.out.println("CASE IS IN UPPERCASE");

        }
        System.out.println(ok);
    }
}
