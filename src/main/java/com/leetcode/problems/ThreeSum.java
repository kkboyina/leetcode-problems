/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kb7290
 */
public class ThreeSum {

    public static void main(String[] args) {

        //int[] arr = {-1, 0, 1, 2, -1, -4};
        int[] arr = {-2, 0, 0, 2, 2};
        threeSum(arr);
    }

    public static void threeSum(int[] nums) {
        int target = 0;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length == 3 && nums[0] + nums[1] + nums[2] == target) {
            List<Integer> ls = new ArrayList();
            ls.add(nums[0]);
            ls.add(nums[1]);
            ls.add(nums[2]);
            list.add(ls);
        }

        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                int lftPtr = i + 1;
                int rhtPtr = nums.length - 1;
                while (lftPtr < rhtPtr) {
                    if (nums[i] + nums[lftPtr] + nums[rhtPtr] == target) {
                        List ls = new ArrayList();
                        ls.add(nums[i]);
                        ls.add(nums[lftPtr]);
                        ls.add(nums[rhtPtr]);
                        list.add(ls);

                        if (!list.contains(ls)) {
                            list.add(ls);
                        }
                    }
                    if (nums[i] + nums[lftPtr] + nums[rhtPtr] < 0) {
                        int currlftptr = lftPtr;
                        while ((lftPtr < rhtPtr) && (nums[lftPtr] == nums[currlftptr])) // to exclude duplicates
                        {
                            lftPtr++;
                        }
                    } else {
                        int currhtPtr = rhtPtr;
                        while ((lftPtr < rhtPtr) && (nums[rhtPtr] == nums[currhtPtr])) // to exclude duplicates
                        {
                            rhtPtr--;
                        }
                    }
                }
            }
        }

        // return list;
    }
}
