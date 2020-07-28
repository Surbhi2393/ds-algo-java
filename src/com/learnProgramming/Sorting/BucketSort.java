package com.learnProgramming.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void main(String[] args) {

        int[] arr = {54,46,83,66,95,92,43};

        bucketSort(arr);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void bucketSort(int[] arr){

        List<Integer>[] buckets = new List[10];

        for(int i=0;i<buckets.length;i++){
            buckets[i]=new ArrayList<>();
        }

        for (int i=0;i<arr.length;i++){
            buckets[hash(arr[i])].add(arr[i]);
        }

        for (List bucket: buckets){
            Collections.sort(bucket);
        }

        int j=0;
        for(int i=0;i<buckets.length;i++){
           for(int value : buckets[i]){
               arr[j++]=value;
           }
        }
    }

    public static int hash(int value){
        return value/10;
    }
}
