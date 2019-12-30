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
public class FindMedianSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 7};
        int[] arr2 = new int[]{4, 5, 6};

        findMedianSortedArrays(arr1, arr2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int newLength = nums1.length + nums2.length;
        int[] arr = new int[newLength];
        //System.arraycopy(nums1, 0, arr, 0, nums1.length);
        //System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);

        int nums1Ct = 0, nums2Ct = 0;
        while (nums1Ct < nums1.length || nums2Ct < nums2.length) {
            if (nums1Ct != nums1.length && nums1[nums1Ct] < nums2[nums2Ct]) {
                arr[nums1Ct + nums2Ct] = nums1[nums1Ct];
                nums1Ct++;
            } else {
                arr[nums1Ct + nums2Ct] = nums2[nums2Ct];
                nums2Ct++;
            }
        }

        for (int i : arr) {
            System.out.print(i);
        }
        return 0.0;
    }

}
