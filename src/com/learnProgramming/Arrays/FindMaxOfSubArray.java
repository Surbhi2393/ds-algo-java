package com.learnProgramming.Arrays;

//Given an array of size N and an integer k, task is to find
// maximum for each and every contiguous subarray of size k
public class FindMaxOfSubArray {

    public static void findMaxOfSubArray(int[] input, int k){

        for(int i=0;i<=input.length-k;i++){
            int max = input[i];
            for(int j=1;j<k;j++) {
                if (input[i+j] > max) {
                    max = input[i+j];
                }
            }
            System.out.print(max+" ");
        }

    }

    public static void main(String[] args) {
        int[] input = {1,2,3,1,4,5,2,3,6};
        int k =3;
        findMaxOfSubArray(input,k);
    }
}
