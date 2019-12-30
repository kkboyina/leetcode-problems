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
public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        majorityElement(arr);
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
       int v =  map.entrySet().stream().max((a, b) -> a.getValue()-b.getValue()).get().getKey();
        
        return v;
    }
}
