package com.learnProgramming.String;

//Write a function that reverses a string.
// The input string is given as an array of characters char[].
public class ReverseString {

    public static void reverseString(char[] s) {

        int i=0;
        int j=s.length-1;
        while(i<j){
           char temp=s[i];
           s[i++]=s[j];
           s[j--]=temp;
        }

        for (char c: s) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        char[] charArray ={'h','e','l','l','o'};
        reverseString(charArray);
    }
}
