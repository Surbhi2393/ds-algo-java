package com.learnProgramming.DynamicProgramming;

public class MaxSubArray {

    public static int maxSubArray(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }

        int max = nums[0];
        int maxCurrent = 0;
        for(int i=0;i<nums.length;i++){
            maxCurrent+=nums[i];
            if(maxCurrent==0 || nums[i]>maxCurrent){
                maxCurrent=nums[i];
            }
            max = Math.max(max,maxCurrent);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
