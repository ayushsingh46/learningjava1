package com.ayyuusshh;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int  target = 2;
        int ans = binarySearch(arr, target);
        System.out.println("the element "+ target+ " found at the index:" +ans);
    }

    static int binarySearch(int[] arr, int target ){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2; //the reason behind using this formula instead of (start+end)/2 is it can take big integer values

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
