package com.learnProgramming.Queues;

import java.util.LinkedList;

public class QueueProblem {

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

        LinkedList<Character> linkedStack = new LinkedList<>();
        LinkedList<Character> linkedQueue = new LinkedList<>();
        String str = input.toLowerCase();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>='a' && c<='z'){
                linkedStack.push(c);
                linkedQueue.addLast(c);
            }
        }

        //System.out.println(linkedQueue +" "+ linkedStack);
        while (!linkedStack.isEmpty()){
            if(!linkedStack.pop().equals(linkedQueue.removeFirst())){
                return false;
            }
        }

        return true;
    }
}
