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
public class GameOfLife {

    public static void main(String[] args) {
        int[][] life = {
            {0, 1, 0},
            {0, 0, 1},
            {1, 1, 1},
            {0, 0, 0}
        };

        gameOfLife(life);
    }

    public static void gameOfLife(int[][] board) {
        int[][] newboard = new int[board.length][board[0].length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {

                int neighbours = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        neighbours += (row + i < 0 || col + j < 0 || row + i >= board.length || col + j >= board[row].length)
                                ? 0 : board[row + i][col + j];
                    }
                }

                neighbours -= board[row][col];

                if (board[row][col] == 1 && neighbours < 2) {
                    //live cell with fewer than two live neighbors dies, as if caused by under-population
                    newboard[row][col] = 0;
                } else if (board[row][col] == 1 && (neighbours == 2 || neighbours == 3)) {
                    newboard[row][col] = 1;
                } else if (board[row][col] == 1 && neighbours > 3) {
                    newboard[row][col] = 0;
                } else if (board[row][col] == 0 && neighbours == 3) {
                    newboard[row][col] = 1;
                }

            }

        }
        System.out.println(Arrays.deepToString(newboard));
        //int count = exploreneighbors(board, 0, 0);
        //System.out.println(count);
    }

//    public static int exploreneighbors(int[][] board, int row, int col) {
//        int neighbours = 0;
//
//        for (int i = -1; i <= 1; i++) {
//            for (int j = -1; j <= 1; j++) {
//                neighbours += board[row + i][col + j];
//            }
//        }
//
////        // if we are reaching the boundries the dont consider 
////        if (row < 0 || col < 0 || row >= board.length || col >= board[row].length) {
////            return neighbours;
////        }
//        // exploring all possible directions 
////        return board[row][col]
////                + exploreneighbors(board, row - 1, col - 1)
////                + exploreneighbors(board, row - 1, col)
////                + exploreneighbors(board, row - 1, col + 1)
////                + exploreneighbors(board, row, col - 1)
////                + exploreneighbors(board, row, col)
////                + exploreneighbors(board, row, col + 1)
////                + exploreneighbors(board, row + 1, col - 1)
////                + exploreneighbors(board, row + 1, col)
////                + exploreneighbors(board, row + 1, col + 1);
//    }
}
