package com.learnProgramming.BinarySearchTrees;

import java.util.*;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value == data){
            return;
        }
        if(value<data){
            if(leftChild==null){
                leftChild = new TreeNode(value);
            }else{
                leftChild.insert(value);
            }
        }else{
            if(rightChild==null){
                rightChild = new TreeNode(value);
            }else{
                rightChild.insert(value);
            }
        }
    }

    public TreeNode get(int value){
        if(value==data){
            return this;
        }

        if(value<data){
            if(leftChild!=null){
                return leftChild.get(value);
            }
        }else{
            if(rightChild!=null){
                return rightChild.get(value);
            }
        }

        return null;
    }

    public int min(){
        if(leftChild==null){
            return data;
        }
        return leftChild.min();
    }

    public int max(){
        if(rightChild==null){
            return data;
        }
        return rightChild.max();
    }

    public void traverseInOrder(){
        if(leftChild!=null){
            leftChild.traverseInOrder();
        }
        System.out.print(data+", ");
        if(rightChild!=null){
            rightChild.traverseInOrder();
        }
    }

    public void traversePreOrder(){
        System.out.print(data+", ");
        if(leftChild!=null){
            leftChild.traversePreOrder();
        }
        if(rightChild!=null){
            rightChild.traversePreOrder();
        }
    }

    public boolean isValidBST(TreeNode node, Integer lower, Integer upper) {
        if(node==null){
            return true;
        }

        Integer value = node.getData();
        if(lower!=null && value<=lower){
            return false;
        }
        if(upper!=null && value>=upper){
            return false;
        }

        if(!(isValidBST(node.getRightChild(),value,upper))){
            return false;
        }

        if(!(isValidBST(node.getLeftChild(),lower,value))){
            return false;
        }

        return true;
    }

    public List<List<Integer>> levelOrder(Queue<TreeNode> queue) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list1 = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.remove();
                list1.add(node.getData());
                if(node.getLeftChild()!=null){
                    queue.add(node.getLeftChild());
                }
                if(node.getRightChild()!=null){
                    queue.add(node.getRightChild());
                }
            }
            levelOrder.add(list1);

        }

        return levelOrder;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
