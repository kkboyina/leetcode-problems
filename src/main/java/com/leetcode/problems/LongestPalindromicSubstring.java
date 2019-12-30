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
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("null"));
    }

    public static String longestPalindrome(String s) {
        StringBuilder palindrome = new StringBuilder();
        String rev = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==rev.charAt(i)){
                palindrome.append(s.charAt(i));
            }
        }
        return palindrome.toString();
    }
}
