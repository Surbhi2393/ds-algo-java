package com.learnProgramming.Design;

import java.util.Random;

//Shuffle a set of numbers without duplicates.
public class ShuffleArray {

    private int[] array;
    private int[] original;

    Random random = new Random();

    public int randomInteger(int min, int max){
        return random.nextInt(max-min) + min;
    }

    public ShuffleArray(int[] nums){
        array = nums;
        original = nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array = original;
        original = original.clone();
        return original;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=0;i<array.length;i++){
            swap(i,randomInteger(i,array.length));
        }
        return array;
    }

    public void swap(int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ShuffleArray obj = new ShuffleArray(nums);
        int[] param_1 = obj.reset();
        int[] param_2 = obj.shuffle();
        //System.out.println(param_1);
        //System.out.println(param_2);
    }
}
