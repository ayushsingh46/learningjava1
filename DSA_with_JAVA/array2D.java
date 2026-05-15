package com.ayyuusshh;

import java.util.Arrays;
import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[][] arr2D  = new int[3][];

//        int[][] arr2D = {
//                {1, 2, 3, 4},  // 0th index
//                {5, 6, 7},  // 1st index
//                {8, 9}      // 2nd index
//        };
        int [][] arr2D = new int[2][4];
        System.out.println(arr2D.length);

        //input
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = in.nextInt();
            }
        }
        /*
output
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
output
        for( int i = 0 ; i< arr2D.length; i++){
            System.out.println(Arrays.toString(arr2D[i]));
      }
*/

       // using of inhanced for loop
        for (int[] ints : arr2D) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
