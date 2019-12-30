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
public class AATest {

    public static void main(String[] args) {
        System.out.println(toLowerCase("al&phaBET"));
    }

    public static String toLowerCase(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        //str.toLowerCase()
        char[] chr = str.toCharArray();

        for (int i = 0; i < chr.length; i++) {
            char c = chr[i];

             chr[i] = (c >= 'A' && c <= 'Z') ? ((char) (c + 32)) : c;
        }
        return Arrays.toString(chr);
    }

}
