package com.learnProgramming.lists;

public class LinkedLists {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "John","Doe");
        Employee employee2 = new Employee(2, "Charlie", "Puth");
        Employee employee3 = new Employee(3, "James", "Cornor");
        Employee employee4 = new Employee(4, "Harry", "Styles");

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();

        System.out.println(list.getSize());

        list.printList();

        //for integer linked list
        IntegerLinkedList intList = new IntegerLinkedList();
        intList.insertSorted(4);
        intList.insertSorted(5);
        intList.insertSorted(3);
        intList.insertSorted(7);
        intList.insertSorted(6);
        intList.insertSorted(2);
        intList.insertSorted(9);
        System.out.println("Insert Sorted:");
        intList.printList();

        System.out.println("Is List Palindrome:");
        System.out.println(intList.isPalindrome());

        IntegerNode node = new IntegerNode(4);
        intList.deleteNode(node);
        System.out.println("After deleting 4:");
        intList.printList();

        intList.removeNthFromEnd(3);
        System.out.println("After deleting 3rd from end");
        intList.printList();

        intList.reverseList();
        System.out.println("After reversing list:");
        intList.printList();

        IntegerLinkedList intList2 = new IntegerLinkedList();
        intList2.addToFront(3);
        intList2.addToFront(4);
        intList2.addToFront(4);
        intList2.addToFront(3);
        System.out.println("Is List2 Palindrome:");
        System.out.println(intList2.isPalindrome());
    }
}
