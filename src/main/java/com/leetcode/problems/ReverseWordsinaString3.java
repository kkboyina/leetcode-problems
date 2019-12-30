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
public class ReverseWordsinaString3 {

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }

    public static String reverseWords(String s) {
        String[] sarr = s.split(" ");
        for (int i = 0; i < sarr.length; i++) {
            StringBuilder sb = new StringBuilder(sarr[i]);
            sarr[i] = sb.reverse().toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String string : sarr) {
            sb.append(string).append(" ");
        }
        return sb.toString().trim();
    }
    
     public static String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, k)).reverse().append(s.substring(k,s.length())).toString();
        return sb.toString();
    }
}
