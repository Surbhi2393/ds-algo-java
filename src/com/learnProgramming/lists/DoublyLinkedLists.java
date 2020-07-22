package com.learnProgramming.lists;

public class DoublyLinkedLists {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "John","Doe");
        Employee employee2 = new Employee(2, "Charlie", "Puth");
        Employee employee3 = new Employee(3, "James", "Cornor");
        Employee employee4 = new Employee(4, "Harry", "Styles");

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(employee1);
        list.addToFront(employee2);
        list.addToFront(employee3);
        list.addToFront(employee4);

        list.printList();
        System.out.println(list.getSize());

        Employee employee5 = new Employee(5, "Bill", "Adams");

        list.addToEnd(employee5);
        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

        list.addBefore(employee4, employee3);
        list.printList();
    }
}
