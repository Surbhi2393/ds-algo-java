package com.learnProgramming.Queues;

import com.learnProgramming.lists.Employee;

import java.util.NoSuchElementException;

public class CircularQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public CircularQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee employee){
        if(size()== queue.length-1){
            int numOfItems = size();
            Employee[] newQueue = new Employee[2*queue.length];
            System.arraycopy(queue, front, newQueue, 0, queue.length-front);
            System.arraycopy(queue, 0, newQueue, queue.length-front, back);
            queue = newQueue;

            front=0;
            back=numOfItems;
        }
        queue[back]=employee;
        if(back<queue.length-1){
            back++;
        }else{
            back=0;
        }
    }

    public Employee remove(){
        if(size()==0){
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if(size()==0){
            front=0;
            back=0;
        }else if(front==queue.length){
            front=0;
        }
        return  employee;
    }

    public int size(){
        if(front<=back){
            return back-front;
        }else{
            return back-front+queue.length;
        }

    }

    public Employee peek(){
        if(size()==0){
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        return  employee;
    }

    public void printQueue(){
        if(front<=back){
            for(int i=front;i<back;i++){
                System.out.println(queue[i]);
            }
        }else{
            for(int i=front;i<queue.length;i++){
                System.out.println(queue[i]);
            }

            for (int i=0;i<back;i++){
                System.out.println(queue[i]);
            }
        }

    }
}
