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
public class RotateArray {

    public static void main(String[] args) {

        rotate(new int[]{1}, 1);
    }

    public static void rotate(int[] nums, int k) {
        if (k >= nums.length) {
            rotate(nums, k-nums.length);
        }
        int[] tmp = new int[nums.length];

        System.arraycopy(nums, k + 1, tmp, 0, k);

        System.arraycopy(nums, 0, tmp, k, k + 1);

//        
//        for(int i=k;i<nums.length;i++){
//            tmp[i] = nums[i-k];
//        }
//        
//        for(int i=1;i<=k;i++){
//            tmp[i-1] = nums[i+k];
//        }
//        
        System.arraycopy(tmp, 0, nums, 0, nums.length);

        System.out.println(Arrays.toString(nums));
    }
}
