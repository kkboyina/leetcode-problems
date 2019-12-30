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
public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
//        int duplicates = 0;
//        int val = 0;
//        for (int i = 0, j = 1; i < nums.length - 1 && j < nums.length;) {
//            if (nums[i] == nums[j]) {
//                j++;
//                val += 1;
//            } else {
//                i = j;
//                j=j+1;
//                if (val > 0) {
//                    duplicates += 1;
//                }
//                val = 0;
//
//            }
//        }
//        System.out.println(duplicates);
//        return duplicates;
        int i = 0;
        for (int j = 1; j < nums.length;j++) {
            if(nums[j]!=nums[i]){
                i+=1;
                nums[i]=nums[j];
            }
        }
        return i;
    }
}
