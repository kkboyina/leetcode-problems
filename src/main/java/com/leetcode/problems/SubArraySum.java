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
public class SubArraySum {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};

        System.out.println(subarraySum(arr, 2));
    }

    public static int subarraySum(int[] nums, int k) {
        int cnt = 0;
        if (nums == null || nums.length == 0) {
            return cnt;
        }

        for (int i = 0; i < nums.length; i++) {
            int localsum = 0;
            for (int j = i; j < nums.length; j++) {
                localsum += nums[j];
                if (localsum == k) {
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
}
