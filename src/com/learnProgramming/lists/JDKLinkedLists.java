package com.learnProgramming.lists;

import java.util.Iterator;
import java.util.LinkedList;

public class JDKLinkedLists {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "John","Doe");
        Employee employee2 = new Employee(2, "Charlie", "Puth");
        Employee employee3 = new Employee(3, "James", "Cornor");
        Employee employee4 = new Employee(4, "Harry", "Styles");
        Employee employee5 = new Employee(5, "Bill", "Adams");

        LinkedList<Employee> list = new LinkedList<>();
        //add an item to front of linked list
        list.addFirst(employee1);
        list.addFirst(employee2);
        list.addFirst(employee3);
        list.addFirst(employee4);

        list.add(employee5);

        list.removeFirst();

        list.removeLast();

        //Using iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
