package com.learnProgramming.String;

//Given a 32-bit signed integer, reverse digits of an integer.
public class ReverseInteger {

    public static int reverse(int x) {

        long res=0;
        while(x!=0){
            res=res*10 + x%10;
            x=x/10;
        }

        if(res<Integer.MIN_VALUE || res>Integer.MAX_VALUE){
            return 0;
        }

        return (int)res;
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverse(num));
    }
}
