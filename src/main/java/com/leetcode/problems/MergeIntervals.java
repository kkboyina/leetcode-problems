/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author kb7290
 */
public class MergeIntervals {

    public static void main(String[] args) {
        //int[][] pairs = {{2, 6}, {1, 3}, {8, 10}, {15, 18}};
        int[][] pairs = {{2, 3}, {5, 5}, {2, 2}, {3, 4}, {3, 4}};
        System.out.println(Arrays.deepToString(merge(pairs)));
    }

    public static int[][] merge(int[][] intervals) {

        List<Interval> nodes = new ArrayList<>();

        for (int[] interval : intervals) {
            nodes.add(new Interval(interval[0], interval[1]));
        }

        Collections.sort(nodes, (Interval a, Interval b) -> a.start - b.start);
        Stack<Interval> st = new Stack<>();
        st.add(nodes.get(0));
        for (int i = 1; i < nodes.size(); i++) {
            if (hasOverLap(st.peek(), nodes.get(i))) {

                Interval a = st.pop();
                Interval b = nodes.get(i);

                if (a.start <= b.start && b.end <= a.end) {
                    st.push(new Interval(a.start, a.end));
                } else {
                    st.push(new Interval(a.start, b.end));
                }

            } else {
                st.push(nodes.get(i));
            }
        }

        int[][] merged = new int[st.size()][2];
        for (int i = merged.length - 1; i >= 0; i--) {
            Interval pop = st.pop();
            merged[i] = new int[]{pop.start, pop.end};
        }

        return merged;
    }

    public static boolean hasOverLap(Interval a, Interval b) {

        return a.end >= b.start && a.start <= b.end;
    }

    public static class Interval {

        final int start;
        final int end;

        public Interval(int a, int b) {
            this.start = a;
            this.end = b;
        }

    }
}
