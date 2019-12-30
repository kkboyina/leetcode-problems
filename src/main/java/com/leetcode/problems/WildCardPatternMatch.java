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
public class WildCardPatternMatch {

    public static void main(String[] args) {
        String str = "xaylmz";
        String pattern = "x?y*z";
        boolean isMatching = validatePattern(str, pattern);
        System.out.println("Pattern Matches " + isMatching);
    }

    private static boolean validatePattern(String str, String pat) {
        char[] string = str.toCharArray();
        char[] pattern = pat.toCharArray();
        boolean[][] matrix = new boolean[string.length + 1][pattern.length + 1];
        matrix[0][0] = true;
        for (int row = 1; row < matrix.length; row++) {
            for (int column = 1; column < matrix[row].length; column++) {
                switch (pattern[column - 1]) {
                    case '?':
                        if (string[row - 1] == pattern[column - 1]) {
                            matrix[row][column] = matrix[row - 1][column - 1];
                        }
                        break;
                    case '*':
                        matrix[row][column] = matrix[row - 1][column] || matrix[row][column - 1];
                        break;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        return matrix[string.length][pattern.length];
    }
}
