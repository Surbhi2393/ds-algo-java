package com.learnProgramming.ds.Sorting;

//Given two sorted integer arrays nums1 and nums2,
// merge nums2 into nums1 as one sorted array.
public class MergeSortProblem {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=0;
        int j=0;
        int tempIndex=0;
        int[] temp = new int[m+n];

        if(m==0) {
            System.arraycopy(nums2,0,nums1,0,n);
        }else if(n!=0){
            while (i < m && j < n) {
                temp[tempIndex++] = nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++];
                if (i == m && j < n) {
                    System.arraycopy(nums2, j, temp, tempIndex, n - j);
                } else if (i < m && j == n) {
                    System.arraycopy(nums1, i, temp, tempIndex, m - i);
                }
            }

            System.arraycopy(temp, 0, nums1, 0, temp.length);
        }

        for (int num: nums1) {
            System.out.println(num);
        }

    }

    public static void main(String[] args) {
        /*int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;*/
        int[] nums1={1,2,4,5,6,0};
        int m=5;
        int[] nums2={3};
        int n=1;
        merge(nums1,m,nums2,n);
    }
}
