package com.learnProgramming.Design;

import java.util.ArrayList;
import java.util.List;

//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
public class MinStack {

    private List<Integer> stack;
    private int min;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        stack.add(x);
        min = Math.min(min, x);
    }

    public void pop() {
        if(stack.isEmpty()){
            return;
        }

        int last = stack.size()-1;
        int value = stack.get(last);
        stack.remove(last);

        if(value==min){
            updateMin();
        }
    }

    public int top() {
        int last = stack.size()-1;
        return stack.get(last);
    }

    public int getMin() {
        return min;
    }

    public void updateMin(){
        min = Integer.MAX_VALUE;
        for(int value : stack){
            min = Math.min(min, value);
        }
    }
}
