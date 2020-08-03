package com.learnProgramming.BinarySearchTrees;

import java.util.List;

public class TreeProblems {

    public static void main(String[] args) {

        Tree intTree = new Tree();
        intTree.insert(3);
        intTree.insert(9);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(17);

        System.out.println(intTree.maxDepth(intTree.getRoot()));
        System.out.println(intTree.isValidBST());
        List<List<Integer>> list = intTree.levelOrder();
        System.out.println(list);

        int[] nums = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);
        root.traverseInOrder();

    }

    //Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
    //For this problem, a height-balanced binary tree is defined
    // as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private static TreeNode helper(int[] nums, int startIdx, int endIdx) {
        if (startIdx > endIdx) {
            return null;
        }
        int medIdx = startIdx + (endIdx - startIdx) / 2;
        TreeNode node = new TreeNode(nums[medIdx]);
        node.setLeftChild(helper(nums, startIdx, medIdx-1));
        node.setRightChild(helper(nums, medIdx+1, endIdx));
        return node;
    }
}
