package com.learnProgramming.DynamicProgramming;

//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
// the only constraint stopping you from robbing each of them is that adjacent houses have security system connected
// and it will automatically contact the police if two adjacent houses were broken into on the same night.
//Given a list of non-negative integers representing the amount of money of each house,
// determine the maximum amount of money you can rob tonight without alerting the police.
public class HouseRobber {

    public static int rob(int[] nums) {

        if(nums==null || nums.length==0){
            return 0;
        }

        if(nums.length==1){
            return nums[0];
        }

        int[] res = new int[nums.length];
        res[0]=nums[0];
        res[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            res[i] = Math.max(res[i-2]+nums[i], res[i-1]);
        }

        return res[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}
