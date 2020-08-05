package com.learnProgramming.PriorityQueues;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);

        //returns the min value
        System.out.println(pq.peek());
        //removes the highest priority element
        System.out.println(pq.remove());

        System.out.println(pq.peek());
        //similar to remove
        System.out.println(pq.poll());
        System.out.println(pq.peek());

        System.out.println(pq.remove(54));
        System.out.println(pq.peek());

        pq.add(-1);
        System.out.println(pq.peek());

        //Printing array
        System.out.println("Array:");
        Object[] nums = pq.toArray();
        for (Object i : nums){
            System.out.println(i);
        }
    }
}
