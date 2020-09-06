package com.learnProgramming.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Given arrival and departure times of all trains that reach a railway station,
// the task is to find the minimum number of platforms required for the railway station so that no train waits.
//We are given two arrays which represent arrival and departure times of trains that stop.
public class MinNumberOfPlatforms {

    public static int findMinNumberOfPlatforms(int[] arr, int[] dep){

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=1;
        int j=0;
        int num=1;
        int platforms=1;
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                num++;
                i++;
            }else{
                num--;
                j++;
            }

            if(num>platforms){
                platforms=num;
            }
        }

        return platforms;
    }

    public static int getMinimumPlatforms(List<Integer> arrivalTimes, List<Integer> depTimes) {

        Collections.sort(arrivalTimes);
        Collections.sort(depTimes);

        int i=1;
        int j=0;
        int platforms=1;
        int num=1;
        while(i<arrivalTimes.size() && j<depTimes.size()){
            if(arrivalTimes.get(i) <= depTimes.get(j)){
                num++;
                i++;
            }else{
                num--;
                j++;
            }

            if(num>platforms){
                platforms=num;
            }
        }

        return platforms;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(900);
        arr.add(940);
        List<Integer> dep = new ArrayList<>();
        dep.add(910);
        dep.add(1200);
        System.out.println(getMinimumPlatforms(arr,dep));

    }
}
