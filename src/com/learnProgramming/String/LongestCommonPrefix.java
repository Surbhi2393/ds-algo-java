package com.learnProgramming.String;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        if(strs.length==0){
            return "";
        }

        String s1 = strs[0];
        StringBuilder result = new StringBuilder();
        for(int j=0;j<s1.length();j++){
            int count=1;
            char c = s1.charAt(j);
            for(int i=1;i<strs.length;i++) {
                if(strs[i].charAt(j)==c){
                    count++;
                }
            }

            if(count==strs.length){
                result.append(c);
            }else{
                break;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"aa","a"};
        System.out.println(longestCommonPrefix(strs));
    }
}
