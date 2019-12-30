/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.Stack;

/**
 *
 * @author kb7290
 */
public class MergeSortedArray {

    public static void main(String[] args) {

        int nums1[] = {4, 0, 0, 0, 0, 0};
        int m = 1;
        int nums2[] = {1, 2, 3, 5, 6};
        int n = 5;
        merge(nums1, m, nums2, n);
        Stack<Integer>st = new Stack<Integer>();
       int k  =  st.pop();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length > nums1.length) {
            merge(nums2, n, nums1, m);
        }

        for (int i = 0, j = 0; i < nums1.length && j < n;) {
            if (nums1[i] <= nums2[j]) {
                i++;
            } else if (nums2[j] <= nums1[i]) {
                
            } else {
                int tmp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = tmp;
            }
        }

        for (int i = m, j = 0; i < nums1.length && j < n; i++, j++) {
            nums1[i] = nums2[j];
        }

    }

}
