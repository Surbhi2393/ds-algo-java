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
        System.out.print("HEAD -> ");
        while(current != null){
            System.out.print(current.getData());
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
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
        size++;
    }


    //Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
    public void deleteNode(IntegerNode node){

        IntegerNode current = head;
        IntegerNode previous = head;
        while(current!=null && current.getData()!=node.getData()){
            previous = current;
            current = current.getNext();
        }

        previous.setNext(current.getNext());
        current.setNext(null);

        size--;
    }

    //Given a linked list, remove the n-th node from the end of list and return its head.
    public void removeNthFromEnd(int n) {

        IntegerNode dummy = new IntegerNode(0);
        dummy.setNext(head);
        IntegerNode current = dummy;
        IntegerNode removedNode = dummy;

        for(int i=1;i<=n+1;i++){
           current=current.getNext();
        }

        while(current!=null){
            removedNode = removedNode.getNext();
            current = current.getNext();
        }

        removedNode.setNext(removedNode.getNext().getNext());
        head = dummy.getNext();
    }

    //Reverse a singly linked list.
    public void reverseList() {

        IntegerNode prev = null;
        IntegerNode current = head;

        while (current!=null){
            IntegerNode temp = current.getNext();
            current.setNext(prev);
            prev = current;
            current = temp;
        }

        head = prev;
    }

    //Merge two sorted linked lists and return it as a new sorted list.
    // The new list should be made by splicing together the nodes of the first two lists.
    public void mergeTwoLists(IntegerNode l1, IntegerNode l2) {

        head = new IntegerNode(0);
        IntegerNode current =head;
        while(l1!=null && l2!=null){
            if(l2.getData()>=l1.getData()){
                current.setNext(l1);
                l1=l1.getNext();
            }else{
                current.setNext(l2);
               l2=l2.getNext();
            }
            current=current.getNext();
        }

        if(l1!=null){
            current.setNext(l1);
        }

        if(l2!=null){
            current.setNext(l2);
        }
        head = head.getNext();
    }

    //Given a singly linked list, determine if it is a palindrome.
    public boolean isPalindrome() {
        IntegerNode slow = head;
        IntegerNode fast = head;
        while(fast!=null && fast.getNext()!=null){
            slow=slow.getNext();
            fast=fast.getNext().getNext();
        }

        IntegerNode prev = null;
        IntegerNode current = slow;

        while(current!=null){
            IntegerNode temp = current.getNext();
            current.setNext(prev);
            prev = current;
            current = temp;
        }

        IntegerNode forward = head;
        while(prev!=null && forward!=null){
            if(prev.getData()!=forward.getData()){
                return false;
            }
            prev = prev.getNext();
            forward = forward.getNext();
        }
        return true;
    }

    //Given a linked list, determine if it has a cycle in it.
    public boolean hasCycle(IntegerNode head) {

        if(head==null || head.getNext()==null){
            return false;
        }
        IntegerNode slow = head;
        IntegerNode fast = head.getNext();

        while(slow!=fast) {
            if (fast==null || fast.getNext()!=null) {
                return false;
            }
                slow = slow.getNext();
                fast = fast.getNext().getNext();
        }

        return true;
    }
}
