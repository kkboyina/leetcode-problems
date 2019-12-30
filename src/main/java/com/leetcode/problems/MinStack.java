/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

/**
 *
 * @author kb7290
 */
public class MinStack {

    int[] arr;
    int idx;
    int length = 10;
    int min = Integer.MAX_VALUE;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        arr = new int[length];
        idx = -1;
    }

    public void push(int x) {
        if (x < min) {
            min = x;
        }
        arr[++idx] = x;
    }

    public void pop() {
        if (arr[idx] == min) {
            min = Integer.MAX_VALUE;
            arr[idx] = 0;
            for (int i = 0; i < idx; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
                
            
        } else {
            arr[idx] = 0;
        }
        idx -= 1;

    }

    public int top() {
        return arr[idx];
    }

    public int getMin() {
        return min;
    }
}
