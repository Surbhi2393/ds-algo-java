package com.learnProgramming.Stacks;

import com.learnProgramming.lists.Employee;

public class Stacks {

    public static void main(String[] args) {

        //Stacks using array
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee(1, "John","Adams"));
        stack.push(new Employee(2, "Jane","Austin"));
        stack.push(new Employee(3, "Harry","Thomas"));
        stack.push(new Employee(4, "Mary","Andrew"));
        stack.push(new Employee(5, "Bill","Smith"));

        System.out.println("Print stack:");
        stack.printStack();

        System.out.println("Peeking:");
        System.out.println(stack.peek());

        System.out.println("Print stack:");
        stack.printStack();

        System.out.println("Popped:");
        System.out.println(stack.pop());

        System.out.println("Peeking:");
        System.out.println(stack.peek());

        //Stacks using Linked List
        Employee employee1 = new Employee(1, "John","Adams");
        Employee employee2 = new Employee(2, "Jane","Austin");
        Employee employee3 = new Employee(3, "Harry","Thomas");
        Employee employee4 = new Employee(4, "Mary","Andrew");
        Employee employee5 = new Employee(5, "Bill","Smith");

        LinkedStack stack1 = new LinkedStack();
        stack1.push(employee1);
        stack1.push(employee2);
        stack1.push(employee3);
        stack1.push(employee4);
        stack1.push(employee5);

        System.out.println("Print stack:");
        stack1.printStack();

        System.out.println("Peeking:");
        System.out.println(stack1.peek());

        System.out.println("Print stack:");
        stack1.printStack();

        System.out.println("Popped:");
        System.out.println(stack1.pop());

        System.out.println("Peeking:");
        System.out.println(stack1.peek());

    }
}
