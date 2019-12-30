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
public class NumberofIslands {

    public static void main(String[] args) {
        char[][] chr = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
              System.out.println(numIslands(chr));
        
    }

   

    public static int numIslands(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int islands = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == '1') {
                    islands += 1;
                    callDfs(matrix, row, column);
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return islands;
    }

    private static void callDfs(char[][] matrix, int row, int column) {
        if (row < 0 || column < 0 || row >= matrix.length || column >= matrix[row].length || matrix[row][column] == '0') {
            return;
        }
        matrix[row][column] = '0';
        callDfs(matrix, row - 1, column);//up
        callDfs(matrix, row + 1, column);//down
        callDfs(matrix, row, column - 1);//left
        callDfs(matrix, row, column + 1);//right
    }

    private static int sizeOfIsland(char[][] matrix, int row, int column) {
        if (row < 0 || column < 0 || row >= matrix.length || column >= matrix[row].length || matrix[row][column] == '0') {
            return 0;
        }
        int s = 1;
        for (int r = row - 1; r < row + 1; r++) {
            for (int c = column - 1; c < column + 1; c++) {
                if (r != row && c != column) {
                    s += sizeOfIsland(matrix, r, c);
                }
            }
        }
        return s;
    }
}
