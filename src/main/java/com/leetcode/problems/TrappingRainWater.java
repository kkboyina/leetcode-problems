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
public class TrappingRainWater {

    public static void main(String[] args) {
       int [] trap = {0,1,0,2,1,0,1,3,2,1,2,1};
        trap(trap);
    }

    public static int trap(int[] height) {
        int water = 0;
        if (height == null || height.length == 0) {
            return water;
        }
        int[] lfht = new int[height.length];
        int[] rtht = new int[height.length];

        for (int i = 1; i < lfht.length; i++) {
            lfht[i] = Math.max(lfht[i - 1], height[i - 1]);
        }

        for (int i = rtht.length - 2; i >= 0; i--) {
            rtht[i] = Math.max(rtht[i - 1], height[i - 1]);
        }

        for (int i = 0; i < height.length; i++) {
            int value = Math.min(lfht[i], rtht[i]) - height[i];
            if (value > 0) {
                water += value;
            }
        }

        return water;

    }
}
