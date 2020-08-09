package com.learnProgramming.DynamicProgramming;

//You are climbing a stair case. It takes n steps to reach to the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
public class ClimbingStairs {

    public static int climbStairs(int n) {
        if(n==1){
            return 1;
        }

        int[] num = new int[n+1];
        num[1]=1;
        num[2]=2;
        for(int i=3;i<=n;i++){
           num[i] = num[i-1] + num[i-2];
        }

        return num[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
