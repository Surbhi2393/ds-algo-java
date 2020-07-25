package com.learnProgramming.Stacks;

import java.util.LinkedList;

public class StackProblem {

    public static void main(String[] args) {
        //true
        System.out.println(isPalindrome("abccba"));
        //true
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        //true
        System.out.println(isPalindrome("I did, did I?"));
        //false
        System.out.println(isPalindrome("hello"));
        //true
        System.out.println(isPalindrome("Don't nod"));
    }

    public static boolean isPalindrome(String input){

        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder builder = new StringBuilder(input.length());
        String s = input.toLowerCase();

        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(x>='a' && x<='z'){
                builder.append(x);
                stack.push(x);
            }
        }

        StringBuilder reverseString = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reverseString.append(stack.pop());
        }

        if(builder.toString().equals(reverseString.toString())){
            return true;
        }
        return false;
    }
}
