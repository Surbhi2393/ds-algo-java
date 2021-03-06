package com.learnProgramming.String;

import java.util.HashMap;

//Given a string, find the first non-repeating character in it and return its index.
// If it doesn't exist, return -1.
public class FirstUniqueChar {

    public static int firstUniqChar(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character c =s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
