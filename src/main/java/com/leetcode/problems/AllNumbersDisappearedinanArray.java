/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.Arrays;

/**
 *
 * @author kb7290
 */
public class AllNumbersDisappearedinanArray {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        int sumofn = (nums.length * (nums.length + 1)) / 2;

        for (int i = 0; i < nums.length; i++) {
            nums[i]=-nums[nums[i]];
        }
        System.out.println(Arrays.toString(nums));
//        System.out.println(sum);
//        System.out.println(sumofn);
    }
}
