/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author kb7290
 */
public class LongestSubStringWithoutRepeatingChars {

    public static void main(String[] args) {
        //String str = "abcabcbb";
        String str = "pwwkew";
        subString(str);
    }

    public static void subString(String s) {
        int globalmax = 0;
//        Set<Character> hs = new HashSet<>();
//        for (int endPtr = 0, startPtr = 0; startPtr < s.length() && endPtr < s.length();) {
//            if (hs.contains(s.charAt(endPtr))) {
//                while (s.charAt(endPtr) != s.charAt(startPtr)) {
//                    hs.remove(s.charAt(startPtr++));
//                }
//                hs.remove(s.charAt(startPtr));
//                startPtr++;
//            }
//            hs.add(s.charAt(endPtr));
//            endPtr++;
//            globalmax = Math.max(globalmax, hs.size());
//
//        }
        Set<Character> hs = new HashSet<>();
        for (int start = 0, end = 0; start < s.length() && end < s.length();) {
            if (hs.contains(s.charAt(end))) {
                while (s.charAt(start) != s.charAt(end)) {
                    hs.remove(s.charAt(end--));
                }
                hs.remove(s.charAt(end--));
            }
            hs.add(s.charAt(end++));
            globalmax = Math.max(globalmax, hs.size());
        }

        System.out.println(globalmax);
    }
}
