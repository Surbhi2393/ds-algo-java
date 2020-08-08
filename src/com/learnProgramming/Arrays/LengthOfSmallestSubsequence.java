package com.learnProgramming.Arrays;

//Given an array arr[] of size N and a number K,
// the task is to find the length of the smallest subsequence
// such that the sum of the subsequence is greater than or equal to number K.
public class LengthOfSmallestSubsequence {

    public static int lengthOfSmallestSubsequence(int[] arr, int k){

        int minLength=arr.length+1;
        for(int start=0;start<arr.length;start++){
            int curr = arr[start];

            if(curr>=k){
                return 1;
            }

            for(int end=start+1;end<arr.length;end++){
                curr += arr[end];

                if(curr>=k && (end-start+1)<minLength){
                    minLength = end-start+1;
                }
            }
        }

        if(minLength>arr.length){
            return -1;
        }
        return minLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 4, 7, 6, 5, 12};
        int k = 70;
        System.out.println(lengthOfSmallestSubsequence(arr,k));
    }
}
