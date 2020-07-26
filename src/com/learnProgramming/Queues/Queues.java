package com.learnProgramming.Queues;

import com.learnProgramming.lists.Employee;

public class Queues {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "John","Adams");
        Employee employee2 = new Employee(2, "Jane","Austin");
        Employee employee3 = new Employee(3, "Harry","Thomas");
        Employee employee4 = new Employee(4, "Mary","Andrew");
        Employee employee5 = new Employee(5, "Bill","Smith");

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(employee1);
        queue.add(employee2);
        queue.add(employee3);
        queue.add(employee4);
        queue.add(employee5);

        System.out.println("Printing queue:");
        queue.printQueue();

        System.out.println("Removing from queue:");
        queue.remove();
        queue.remove();
        queue.printQueue();

        System.out.println("Peek:");
        System.out.println(queue.peek());
        queue.printQueue();

        System.out.println("Removing more:");
        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove();

        System.out.println("Adding into queue:");
        queue.add(employee1);
        queue.printQueue();

        //Problem with non-circular queue
        ArrayQueue queue1 = new ArrayQueue(5);
        System.out.println("Alternating add and remove:");
        queue1.add(employee1);
        queue1.add(employee2);
        queue1.remove();
        queue1.add(employee3);
        queue1.remove();
        queue1.add(employee4);
        queue1.remove();
        queue1.add(employee5);
        queue1.remove();
        queue1.add(employee1);

        //Circular queue
        CircularQueue circularQueue = new CircularQueue(5);
        System.out.println("Adding in circular queue:");
        circularQueue.add(employee1);
        circularQueue.add(employee2);
        circularQueue.add(employee3);
        circularQueue.add(employee4);
        circularQueue.add(employee5);
        circularQueue.printQueue();

        System.out.println("Removing from circular queue:");
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.printQueue();

        System.out.println("Peeking:");
        System.out.println(circularQueue.peek());
        circularQueue.printQueue();

        System.out.println("Removing all elements:");
        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();
        //circularQueue.remove();
        circularQueue.printQueue();

        System.out.println("Adding one element:");
        circularQueue.add(employee1);
        circularQueue.printQueue();


        System.out.println("Alternating add and remove with circular queue:");
        CircularQueue circularQueue1 = new CircularQueue(5);
        circularQueue1.add(employee1);
        circularQueue1.add(employee2);
        circularQueue1.remove();
        circularQueue1.add(employee3);
        circularQueue1.remove();
        circularQueue1.add(employee4);
        circularQueue1.remove();
        circularQueue1.add(employee5);
        circularQueue1.remove();
        circularQueue1.add(employee1);
        circularQueue1.printQueue();
    }
}
