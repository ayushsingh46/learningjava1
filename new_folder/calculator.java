package com.ayyuusshh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the operator: ");
            char asm = sc.next().trim().charAt(0);
            if (asm == '+' || asm == '*' || asm == '/' || asm == '-' || asm == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (asm == '+') {
                    ans = num1 + num2;
                }
                if (asm == '-') {
                    ans = num1 - num2;
                }
                if (asm == '*') {
                    ans = num1 * num2;
                }
                if (asm == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                    if (asm == '%') {
                        ans = num1 % num2;
                    }
                } else if (asm == 'x' || asm == 'X') {
                    break;
                } else {
                    System.out.println("INVALID OPERATOR");
                }
                System.out.println(ans);
            }
        }
    }
}
