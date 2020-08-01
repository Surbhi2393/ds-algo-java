package com.learnProgramming.Searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-22, -15, 1, 7, 20, 35, 55};

        /*System.out.println(iterativeBinarySearch(arr, -15));
        System.out.println(iterativeBinarySearch(arr, 35));
        System.out.println(iterativeBinarySearch(arr, 8888));
        System.out.println(iterativeBinarySearch(arr, 1));*/

        System.out.println(recursiveBinarySearch(arr, -15));
        System.out.println(recursiveBinarySearch(arr, 35));
        System.out.println(recursiveBinarySearch(arr, 8888));
        System.out.println(recursiveBinarySearch(arr, 1));
    }

    public static int iterativeBinarySearch(int[] arr, int value){

        int start =0;
        int end = arr.length;

        while(start<end){
            int midpoint = (start+end)/2;
            System.out.println("Midpoint: "+midpoint);
            if(arr[midpoint]==value){
                return midpoint;
            }else if(arr[midpoint]<value){
                start=midpoint+1;
            }else{
                end=midpoint;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] arr,int value){
        return recursiveBnarySearch(arr, 0, arr.length,value);
    }

    public static int recursiveBnarySearch(int[] input, int start, int end, int value){

        if(start>=end){
            return -1;
        }

        int midpoint = (start+end)/2;
        System.out.println("Midpoint: "+midpoint);
        if(input[midpoint]==value){
            return midpoint;
        }else if(input[midpoint]<value){
            return recursiveBnarySearch(input,midpoint+1,end,value);
        }else{
            return recursiveBnarySearch(input, start, midpoint, value);
        }
    }
}
