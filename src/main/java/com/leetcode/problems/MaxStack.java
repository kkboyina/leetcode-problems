/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.Stack;

/**
 *
 * @author kb7290
 */
public class MaxStack {

    Stack<Integer> stack;
    Stack<Integer> maxStack;
    int max = Integer.MIN_VALUE;

    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty() || x > max) {
            max = x;
        }
        stack.push(x);
    }

    public int pop() {
        int pop = stack.pop();
        if (pop == max) {
            popMax();
        }
        return pop;
    }

    public int top() {

        return stack.peek();
    }

    public int peekMax() {
        return max;
    }

    public int popMax() {
        int tmp = max;
        max = Integer.MIN_VALUE;
        while (!stack.isEmpty()) {
            int check = stack.pop();
            if (check > max) {
                max = check;
            }
            maxStack.push(check);
        }
        while (!maxStack.isEmpty()) {
            stack.push(maxStack.pop());
        }
        return tmp;
    }
}
