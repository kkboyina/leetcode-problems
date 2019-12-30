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
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] area = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        maxArea(area);
    }

    public static int maxArea(int[] height) {
        int maxWater = 0;
        if (height.length >= 2) {
            for (int i = 0, j = height.length - 1; i < j;) {
                maxWater = Math.max(maxWater, Math.min(height[i], height[j]) * (j - i));
                if (height[i] > height[j]) {
                    j--;
                } else {
                    i++;
                }
            }
        }

        System.out.println(maxWater);
        return maxWater;
    }

    public static int maxArea1(int[] height) {
        int maxWater = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxWater = Math.max(maxWater, Math.min(height[i], height[j]) * (j - i));
            }
        }

        System.out.println(maxWater);
        return maxWater;
    }
}
