package com.learnProgramming.Sorting;

public class RadixSort {

    public static void main(String[] args) {

        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(intArray, 10, 4);

        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }

    private static void radixSort(int[] input, int radix, int width){
        for(int i=0; i<width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    private static void radixSingleSort(int[] input, int position, int radix){

        int numItems = input.length;
        int[] countingArray = new int[radix];

        for(int num: input){
            countingArray[getDigit(num, position, radix)]++;
        }

        //Adjust the count array
        for(int j=1; j<radix; j++){
            countingArray[j] += countingArray[j-1];
        }

        int[] tempArray = new int[numItems];
        for(int k=numItems-1; k>=0; k--){
            tempArray[--countingArray[getDigit(input[k], position, radix)]] = input[k];
        }

        for(int k=0; k<numItems; k++){
            input[k] = tempArray[k];
        }
    }

    private static int getDigit(int num, int position, int radix) {
        return (int) (num / Math.pow(radix, position) % radix);
    }
}
