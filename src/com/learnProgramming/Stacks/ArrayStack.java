package com.learnProgramming.Stacks;

import com.learnProgramming.lists.Employee;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    //Time complexity depends on resizing
    public void push(Employee employee){
        if(top==stack.length){
            //resizing the backing array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
    }

    public boolean isEmpty(){
        return (top==0);
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        //top points to the next available position, that is why we decremnt top and then assign
        Employee employee = stack[--top];
        stack[top]=null;
        return employee;
    }

    //always O(1)
    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return stack[top-1];
    }

    public int size(){
        return top;
    }

    public void printStack(){
        for(int i=top-1; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
}
