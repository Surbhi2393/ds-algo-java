package com.learnProgramming.String;

//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//Note: For the purpose of this problem, we define empty string as valid palindrome.
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        String s1=s.replaceAll("[^A-Za-z0-9]","");
        StringBuffer stringBuffer = new StringBuffer(s1);
        String reverseString = stringBuffer.reverse().toString();
        if(reverseString.equalsIgnoreCase(s1)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="0P";
        System.out.println(isPalindrome(s));
    }
}
