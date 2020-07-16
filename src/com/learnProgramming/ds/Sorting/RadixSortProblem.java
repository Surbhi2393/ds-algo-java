package com.learnProgramming.ds.Sorting;

public class RadixSortProblem {

    public static void main(String[] args) {

        String[] array = {"bcdef","dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(array, 26, 5);

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    private static void radixSort(String[] input, int radix, int width){
        for(int i=width-1; i>=0; i--){
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(String[] input, int position, int radix){

        int numItems = input.length;
        char[] countArray = new char[radix];

        for (String value: input) {
            countArray[getIndex(value,position)]++;
        }

        //Adjust the count array
        for(int j=1; j<radix; j++){
            countArray[j] += countArray[j-1];
        }

        String[] tempArray = new String[numItems];
        for(int k=numItems-1; k>=0; k--){
            tempArray[--countArray[getIndex(input[k], position)]] = input[k];
        }

        for(int k=0; k<numItems; k++){
            input[k] = tempArray[k];
        }
    }

    private static int getIndex(String value, int position){
        return value.charAt(position) - 'a';
        // a=97, A=65
    }
}
