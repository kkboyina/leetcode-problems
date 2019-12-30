/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kb7290
 */
public class TwoSum {

    public static void main(String[] args) {

    }

    //Time Complexcity O(n^2) and Space O(1)
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    //Time Complexcity O(n) and Space O(n) // Compromise space for time
    public static int[] twoSumWithMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int cop = target - nums[i];
            if (map.get(cop) != i && map.containsKey(cop)) {
                return new int[]{i, map.get(cop)};
            }
        }
        return null;
    }

}
