package com.learnProgramming.lists;

public class EmployeeDoublyLinkedList {

    private EmployeeDoublyLinkedListNode head;
    private EmployeeDoublyLinkedListNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeDoublyLinkedListNode node = new EmployeeDoublyLinkedListNode(employee);

        if(head==null){
            tail=node;
        }else{
            node.setNext(head);
            head.setPrevious(node);
        }
        head=node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeDoublyLinkedListNode node = new EmployeeDoublyLinkedListNode(employee);

        if(tail==null){
            head=node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail=node;
        size++;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeDoublyLinkedListNode removeFromFront(){
        if (isEmpty()){
            return null;
        }

        EmployeeDoublyLinkedListNode removedNode = head;

        if(head.getNext() == null){
            tail=null;
        }else{
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeDoublyLinkedListNode removeFromEnd(){
        if (isEmpty()){
            return null;
        }

        EmployeeDoublyLinkedListNode removedNode = tail;

        if(tail.getPrevious()==null){
            head=null;
        }else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public void printList(){
        EmployeeDoublyLinkedListNode current = head;
        System.out.print("HEAD -> ");
        while(current != null){
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.print("null");
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee){

        if(isEmpty()){
            return false;
        }

        EmployeeDoublyLinkedListNode current = head;

        while(current!=null && !current.getEmployee().equals(existingEmployee)){
            current = current.getNext();
        }

        if(current==null){
            return false;
        }

        EmployeeDoublyLinkedListNode node = new EmployeeDoublyLinkedListNode(newEmployee);
        node.setPrevious(current.getPrevious());
        node.setNext(current);
        current.setPrevious(node);

        if(head==current){
            head=node;
        }else{
            node.getPrevious().setNext(node);
        }

        size++;
        return true;
    }
}
