/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.Arrays;

/**
 *
 * @author kb7290
 */
public class ReverseAString {

    public static void main(String[] args) {

        //palindromicSubString("abba");
        String str = "hello";
        reverseVowels(str.toCharArray());

    }

    public static void reverseString(char[] str) {

        for (int i = 0, j = str.length - 1; i < j; i++, j--) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        System.out.println(Arrays.toString(str));
    }

    public static void reverseVowels(char[] s) {
        String voString = "aeiouAEIOU";

        for (int i = 0, j = s.length - 1; i < j;) {
            if (voString.indexOf(s[i]) != -1) {
                i++;
            } else if (voString.indexOf(s[j]) != -1) {
                j--;
            } else {
                if ((voString.indexOf(s[i]) != -1) && (voString.indexOf(s[j]) != -1)) {
                    char temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                    i++;
                    j--;
                }

            }

        }
        System.out.println(Arrays.toString(s));
    }

}
