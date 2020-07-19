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
    }
}
