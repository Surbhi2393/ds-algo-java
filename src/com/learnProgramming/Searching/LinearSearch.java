package com.learnProgramming.Searching;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(linearSearch(arr, -15));
        System.out.println(linearSearch(arr, 1));
        System.out.println(linearSearch(arr, 8888));
        System.out.println(linearSearch(arr, -22));
    }

    public static int linearSearch(int[] arr, int value){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }

        return -1;
    }
}
