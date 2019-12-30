/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.PriorityQueue;

/**
 *
 * @author kb7290
 */
public class MedianOfSortedTwoSortedArrays {

    public static void main(String[] args) {

        int[] a = new int[]{1, 3};
        int[] b = new int[]{2};
        System.out.println(findMedianSortedArrays(a, b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int i : nums1) {
//            pq.add(i);
//        }
//
//        for (int i : nums2) {
//            pq.add(i);
//        }
//        int size = pq.size();
//
//        double[] num = new double[size];
//
//        for (int i = 0; i < size; i++) {
//            num[i] = pq.poll();
//        }
//
//        if (size % 2 == 0) {
//            return (num[(size - 1) / 2] + num[(size) / 2]) / 2;
//        } else {
//            return num[size / 2];
//        }
        int l1 = 0;
        int l2 = 0;
        int k = 0;
        int arrl = nums1.length + nums2.length;
        int[] arr = new int[arrl];
        while (l1 < nums1.length && l2 < nums2.length) {

            if (nums1[l1] <= nums2[l2]) {
                arr[k++] = nums1[l1++];
            } else {
                arr[k++] = nums2[l2++];
            }
        }
        while (l1 < nums1.length) {
            arr[k++] = nums1[l1++];
        }
        while (l2 < nums2.length) {
            arr[k++] = nums2[l2++];
        }
        if (arrl % 2 == 0) {
            int pos = (arrl / 2);
            return (double)(arr[pos - 1] + arr[pos]) / 2;
        } else {
            return (double)arr[(arrl / 2)];
        }
    }
}
