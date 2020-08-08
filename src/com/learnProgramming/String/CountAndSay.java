package com.learnProgramming.String;

//The count-and-say sequence is the sequence of integers with the first five terms as following:
//1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
//1 is read off as "one 1" or 11.
//11 is read off as "two 1s" or 21.
//21 is read off as "one 2, then one 1" or 1211.
//Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
// You can do so recursively, in other words from the previous member read off the digits,
// counting the number of digits in groups of the same digit.
//Note: Each term of the sequence of integers will be represented as a string.
public class CountAndSay {

    public static String countAndSay(int n) {
        if(n<=0){
            return "";
        }
        String result="1";
        for(int i=1;i<n;i++){
            result = helper(result);
        }
        return result;
    }

    public static String helper(String s){
        char previousChar = s.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if(c!=previousChar){
                sb.append(count+""+previousChar);
                previousChar=c;
                count=1;
            }else{
                count++;
            }
        }
        sb.append(count+""+previousChar);
        return sb.toString();
    }

    public static void main(String[] args) {
        int input = 4;
        System.out.println(countAndSay(input));
    }
}
