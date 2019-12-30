/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kb7290
 */
public class FindDisappearedNumbers {

    public static void main(String[] args) {

        findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
    }

    public static List<Integer>  findDisappearedNumbers(int[] nums) {

        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, true);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                list.add(i);
            }
        }
        return list;

//        int sumofn = (nums.length * (nums.length + 1)) / 2;
//
//        System.out.println(sumofn);
//       
//        boolean[] b = new boolean[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            sumofn  = sumofn-nums[i];
//            if(b[nums[i]-1] == true){
//                System.out.println(nums[i]);
//                sumofn = sumofn+nums[i];
//            }
//            b[nums[i]-1] = true;
//        }
//        
//        System.out.println(sumofn);
        //return list;
    }
}
