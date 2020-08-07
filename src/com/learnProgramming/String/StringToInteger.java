package com.learnProgramming.String;

//Implement atoi which converts a string to an integer.
public class StringToInteger {

    public static int myAtoi(String str) {
        String s1 = str.trim();
        if(s1.isEmpty() || (s1.charAt(0)>='a' && s1.charAt(0)<='z')){
            return 0;
        }
        //System.out.println(s1);
        int start=0;
        int sign = 1;
        if(s1.charAt(0)=='+'){
            sign=1;
            start++;
        }else if(s1.charAt(0)=='-'){
            sign=-1;
            start++;
        }
        //System.out.println(sign+","+start);
        long sum=0;
        for(int i=start;i<s1.length();i++){
            char c = s1.charAt(i);
            if(!Character.isDigit(c)){
                break;
            }else{
                sum = sum*10 + (c - '0');
            }

            if(sign==1 && sum>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(sign==-1 && (-1)*sum<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }

        return (int)sum* sign;
    }

    public static void main(String[] args) {
        String s = "9223372036854775808";
        System.out.println(myAtoi(s));
    }
}
