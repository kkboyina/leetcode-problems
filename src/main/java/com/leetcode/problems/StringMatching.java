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
public class StringMatching {

    public static void main(String[] args) {
        String s = "aabaaabc";
        String m = "aabc";
        int i = 0;
        int j = 0;
        for (; i < s.length() && j < m.length();) {
            if (s.charAt(i) == m.charAt(j)) {
                i++;
                j++;
            } else {
                j = 0;
                i -= 1;
            }
            if (j == m.length()) {
                break;
            }
        }
        System.out.println(i - j);
    }
}
