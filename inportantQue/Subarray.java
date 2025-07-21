// package inportantQue;
// import java.util.*;

public class Subarray {

    public static void MaxSumSubarraySol(int arr[]){
        int currsum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i< arr.length; i++){
            currsum = Math.max(arr[i], currsum + arr[i] );
            maxSum = Math.max(currsum ,maxSum);
        }
        System.out.println("The max Sum of Array is: " + maxSum);
    }
    public static void main(StringClass args[]){
        int arr[] = {1,-2,-3,-4,-5};
        MaxSumSubarraySol(arr);
    }
}
