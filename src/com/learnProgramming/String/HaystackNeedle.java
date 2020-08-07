package com.learnProgramming.String;

//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class HaystackNeedle {

    public static int strStr(String haystack, String needle) {

        if(needle.isEmpty()){
            return 0;
        }

        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "aaaaa";
        String needle = "bba";
        System.out.println(strStr(haystack,needle));
    }
}
