package com.ayyuusshh;

import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] asm = new int[5];

        for (int i = 0; i< asm.length ; i++){
            asm[i] = sc.nextInt();
        }
//        for (int j : asm) {
//            System.out.print(j + " ");
//        }
        System.out.println(Arrays.toString(asm));
    }
}
