package com.learnProgramming.ds.Sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //iterative approach
        /*for(int firstSortedIndex=1; firstSortedIndex<intArray.length; firstSortedIndex++){

            int newElement = intArray[firstSortedIndex];
            int i;

            for(i=firstSortedIndex; i>0 && intArray[i-1]>newElement; i--){
                intArray[i]=intArray[i-1];
            }

            intArray[i] = newElement;
        }*/

        //recursive approach
        //insertionSort(intArray, 1);
        insertionSortAnotherApproach(intArray, intArray.length);

        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }

    private static void insertionSort(int[] input, int firstSortedIndex){

        if(firstSortedIndex>(input.length-1)){
            return;
        }

        int newElement = input[firstSortedIndex];
        int i;

        for(i=firstSortedIndex; i>0 && input[i-1]>newElement; i--){
            input[i]=input[i-1];
        }

        input[i] = newElement;
        insertionSort(input, ++firstSortedIndex);
    }

    private static void insertionSortAnotherApproach(int[] input, int numOfItems){

        if(numOfItems<2){
            return;
        }

        insertionSortAnotherApproach(input, numOfItems-1);

        int newElement = input[numOfItems-1];
        int i;

        for(i=numOfItems-1; i>0 && input[i-1]>newElement; i--){
            input[i]=input[i-1];
        }

        input[i] = newElement;
    }
}
