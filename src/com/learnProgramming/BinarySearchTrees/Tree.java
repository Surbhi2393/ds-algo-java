package com.learnProgramming.BinarySearchTrees;

public class Tree {

    private TreeNode root;

    public void insert(int value){
        if(root==null){
            root = new TreeNode(value);
        }else{
            root.insert(value);
        }
    }

    public void traverseInOrder(){
        if(root!=null){
            root.traverseInOrder();
        }
    }

    public void traversePreOrder(){
        if(root!=null){
            root.traversePreOrder();
        }
    }

    public TreeNode get(int value){
        if(root!=null){
            return root.get(value);
        }
        return null;
    }

    public int min(){
        if(root!=null){
            return root.min();
        }
        return Integer.MIN_VALUE;
    }

    public int max(){
        if(root!=null){
            return root.max();
        }
        return Integer.MAX_VALUE;
    }

    public void delete(int value){
        root = delete(root,value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value){
        if(subTreeRoot==null){
            return subTreeRoot;
        }

        if(value<subTreeRoot.getData()){
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(),value));
        }else if(value>subTreeRoot.getData()){
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(),value));
        }else{
            //Cases 1 and 2 : when node to be deleted has 0 or 1 children
            if(subTreeRoot.getLeftChild()==null){
                return subTreeRoot.getRightChild();
            }else if(subTreeRoot.getRightChild()==null){
                return subTreeRoot.getLeftChild();
            }

            //Case 3: when node to be deleted has 2 children
            //Replace value of node to be deleted with value of smallest node from right subtree
            subTreeRoot.setData(subTreeRoot.getRightChild().min());

            //Delete node with smallest value in right subtree
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(),subTreeRoot.getData()));
        }

        return subTreeRoot;
    }
}
