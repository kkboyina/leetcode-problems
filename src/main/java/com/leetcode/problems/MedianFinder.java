/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.PriorityQueue;

/**
 *
 * @author kb7290
 */
public class MedianFinder {

    /**
     * initialize your data structure here.
     */
    PriorityQueue<Integer> higher;
    PriorityQueue<Integer> lower;

    public MedianFinder() {
        higher = new PriorityQueue<>();
        lower = new PriorityQueue<>((Integer a, Integer b) -> -1 * a.compareTo(b));
    }

    public void addNum(int num) {
        if (lower.isEmpty() || num < lower.peek()) {
            lower.add(num);
        } else {
            higher.add(num);
        }

        if (lower.size() - higher.size() >= 2) {
            higher.add(lower.poll());
        }
        if (higher.size() - lower.size() >= 2) {
            lower.add(higher.poll());
        }
    }

    public double findMedian() {

        PriorityQueue<Integer> biggerHeap = lower.size() > higher.size() ? lower : higher;
        PriorityQueue<Integer> smallerHeap = lower.size() > higher.size() ? higher : lower;

        if (biggerHeap.size() == smallerHeap.size()) {
            return (double) (biggerHeap.peek() + smallerHeap.peek()) / 2;
        } else {
            return (double) biggerHeap.peek();
        }
    }
}
