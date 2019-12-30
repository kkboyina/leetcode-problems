/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kb7290
 */
public class MergeStones {

    public static void main(String[] args) {
        int[] stones = {3, 2, 4, 1};
        int pile = 2;
        System.out.println(mergeStones(stones, pile));
    }

    public static int mergeStones(int[] stones, int K) {
        if ((stones.length % K) == 0) {
            int sum = 0;
            for (int i = 0; i < stones.length; i++) {
                sum += stones[i];
            }

            for (int i = 0; i < stones.length;) {
                int tmp = 0;
                for (int j = i; j < K; j++) {
                    tmp += stones[j];
                }
                i = i + 1;
                sum += tmp;

            }
            return sum;
        }
        return -1;
    }
}
