package com.ayyuusshh;

public class binarySearchOrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int  target = 4;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);

    }

    static int orderAgnostic( int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2; //the reason behind using this formula instead of (start+end)/2 is it can take big integer values

            if(arr[mid] == target){
                return mid;
            }
            if (isAsc){
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                 };
            }
             return - 1;
    }
}



