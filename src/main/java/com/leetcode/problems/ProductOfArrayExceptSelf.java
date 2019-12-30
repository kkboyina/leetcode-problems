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
public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        productExceptSelf(arr);
    }

    public static void productExceptSelf(int[] nums) {//O(n)

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[right.length - 1] = 1;
        for (int i = 1; i < left.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        for (int j = right.length - 2; j >= 0; j--) {
            right[j] = nums[j + 1] * right[j + 1];
        }

        int[] arr = new int[nums.length];
        for (int i = 0, j = 0; i < left.length && j < right.length; i++, j++) {
            arr[i] = left[i] * right[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void productExceptSelfOld(int[] nums) {//O(n^2)

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int val = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    val *= nums[j];
                }
            }
            arr[i] = val;
        }
        System.out.println(Arrays.toString(arr));
    }

}
