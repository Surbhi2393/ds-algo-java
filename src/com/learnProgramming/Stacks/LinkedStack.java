package com.learnProgramming.Stacks;

import com.learnProgramming.lists.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack {

    private LinkedList<Employee> stack;

    public LinkedStack(){
        stack = new LinkedList<>();
    }

    public void push(Employee e){
        stack.push(e);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        Iterator itr = stack.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
