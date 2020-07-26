package com.learnProgramming;

import java.util.*;

public class Solutions {

    public static void main(String[] args) {

        char[] input = {'G','e','e','k','Q','u','i','z'};
        int index = findFirstNonRepeatngChar(input);
        if(index==-1){
            System.out.println("No non-repeating char");
        }else{
            System.out.println(input[index]);
        }

        int[] array = {54,586,548,60};
        formLargestPossibleNumber(array);

        runLengthEncoding("wwwwaaadexxxxxxywww");

        countWaysToReachNthStair(4);

        String[] strInput = {"geeksquiz", "geeksforgeeks", "abcd",
                "forgeeksgeeks", "zuiqkeegs"};
        groupAnagrams(strInput);

        String scores [][] = {{"jerry","65"},{"bob","91"}, {"jerry","23"}, {"Eric","83"}};
        highestAvgScore(scores);

        addFractions(1,2,3,3);

        int arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int num = 280;
        smallestsubArray(arr, num);
    }

    public static int findFirstNonRepeatngChar(char[] input){

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<input.length;i++){
            map.put(input[i],map.getOrDefault(input[i],0)+1);
        }

        for(int i=0;i<input.length;i++){
            if(map.get(input[i])==1){
                return i;
            }
        }
        return -1;
    }

    public static void formLargestPossibleNumber(int[] input){

        Integer[] integerArray = Arrays.stream(input).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                Integer x = Integer.parseInt(i1.toString()+i2.toString());
                Integer y = Integer.parseInt(i2.toString()+i1.toString());
                //because we have to sort in reverse order

                return x.compareTo(y) > 0 ? -1:1;
            }
        });

        for(int i=0;i<input.length;i++){
            System.out.print(integerArray[i]);
        }

        System.out.println();
    }

    public static void runLengthEncoding(String input){
        int n = input.length();
        for(int i=0;i<n;i++){
            int count =1;
            while(i<n-1 && input.charAt(i)==input.charAt(i+1)){
                count++;
                i++;
            }

            System.out.print(input.charAt(i));
            System.out.print(count);
        }
        System.out.println();
    }

    public static void countWaysToReachNthStair(int num){
        int n =num+1;
        int[] res = new int[n];
        res[0]=1;
        res[1]=1;
        for(int i=2; i<n; i++){
            for(int j=1; j<=3 && j<=i; j++){
                res[i]+=res[i-j];
            }
        }
        System.out.println(res[n-1]);

    }

    public static void groupAnagrams(String[] input){
        for(int i=0;i<input.length-1;i++){
            for(int j=i+1;j<input.length;j++){
                if(areAnagram(input[i],input[j])){
                    System.out.println(input[i]+" is anagram of "+input[j]);
                }
            }
        }
    }

    public static boolean areAnagram(String s1, String s2){

        Map<Character, Integer> map = new HashMap<>();
        if(s1.length()!=s2.length()){
            return false;
        }

        for(int i=0; i<s1.length(); i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
            map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
        }

        for (Character key : map.keySet()) {
            if(map.get(key)!=0){
                return false;
            }
        }

        return true;
    }

    public static void highestAvgScore(String[][] input){

        Map<String, Integer> map = new HashMap<>();
        int avgSum = 0;
        int m = input.length;
        for(int i=0; i<m ;i++){
            String name = input[i][0];
            int count = 1;
            int sum = Integer.parseInt(input[i][1]);
            if(!map.containsKey(name)){
                for(int j=i+1; j<m; j++){
                    if(name.equals(input[j][0])){
                        sum+=Integer.parseInt(input[j][1]);
                        count++;
                    }
                }
                int avgScore = sum/count;
                map.put(input[i][0],avgScore);
                if(avgScore>avgSum){
                    avgSum=avgScore;
                }
            }
        }
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if(entry.getValue().equals(avgSum)){
                System.out.println(entry.getKey());
            }
        }
    }

    public static void addFractions(int num1, int den1, int num2, int den2){

        int x = (num1*den2)+(num2*den1);
        int y = den1*den2;
        int gcd =1;

        for(int i=1;i<=x && i<=y;i++){
            if(x%i == 0 && y%i==0){
                gcd = i;
            }
        }

        System.out.println("Fraction :"+x/gcd+"/"+y/gcd);
    }

    public static void smallestsubArray(int[] input, int num){

        int count = num+1;
        for(int i =0; i<input.length; i++){
            int sum = input[i];
            if(sum>num){
                count = 1;
            }else{
                for(int j=i+1; j<input.length; j++){
                    sum+=input[j];
                    int length = (j-i)+1;
                    if(sum>num && length<count){
                        count = length;
                    }
                }
            }
        }

        System.out.println("Minimum length: "+count);
    }
}
