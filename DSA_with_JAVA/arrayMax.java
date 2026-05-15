package com.ayyuusshh;


import java.util.Arrays;

import static com.ayyuusshh.arraySwap.swap;

public class arrayMax {

    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 0 ; i< arr.length ; i++){
            if (arr[i]> maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static int maxrange(int[] arr, int start , int end){
        int maxVal = arr[start];
        for (int i = start ; i<= end ; i++){
            if (arr[i]> maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static void reverse(int [] arr){
        int begin = 0;
        int last = arr.length-1;

        while (begin < last){
            swap(arr, begin , last);
            begin++;
            last--;
        }
    }

    public static void main(String[] args) {
        int [] arr = {2, 3, 4 ,5 ,6 ,7 ,8, 1 };

        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        System.out.println(maxrange(arr,2,5));
        reverse(arr);
        System.out.println(arr);
    }
}
