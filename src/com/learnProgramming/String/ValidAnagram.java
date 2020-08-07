package com.learnProgramming.String;

import java.util.Arrays;

//Given two strings s and t , write a function to determine if t is an anagram of s.
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }

    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
}
