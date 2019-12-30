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
public class IsomorphicStrings {

    public static void main(String[] args) {

    }

    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            if (!map.containsKey(s.charAt(i))) {

                if (map.containsValue(t.charAt(i))) {
                    return false;
                } else {
                    map.put(s.charAt(i), t.charAt(i));
                }

            } else {

                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }

        }

        return true;
    }
}
