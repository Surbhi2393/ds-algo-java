package com.learnProgramming.lists;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(int data){
        IntegerNode node = new IntegerNode(data);
        node.setNext(head);
        head=node;
        size++;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public IntegerNode removeFromFront(){
        if (isEmpty()){
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList(){
        IntegerNode current = head;
        System.out.println("HEAD -> ");
        while(current != null){
            System.out.print(current.getData());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }

    public void insertSorted(int input){

        IntegerNode node = new IntegerNode(input);
        if(head==null || head.getData()>=input){
            node.setNext(head);
            head=node;
            return;
        }

        IntegerNode current = head.getNext();
        IntegerNode previous = head;
        while(current!=null && current.getData()<input) {
            previous = current;
            current = current.getNext();
        }

        node.setNext(current);
        previous.setNext(node);

    }
}
