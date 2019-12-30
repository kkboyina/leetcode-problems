/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kb7290
 */
public class CriticalConnectionsinaNetwork {

    public static void main(String[] args) {

        int[][] edges = {{0, 1}, {1, 2}, {2, 0}, {1, 3},{3,4},{4,5},{5,3}};
        criticalConnections(6, edges);

    }

//    public static List<List<Integer>>  criticalConnections(int n, List<List<Integer>> connections) {
//        List<List<Integer>> criricalConnections = new ArrayList<>();
//        int[][] matrix = new int[n][n];
//
//        for (List<Integer> connection : connections) {
//            matrix[connection.get(0)][connection.get(1)] = 1;
//            matrix[connection.get(1)][connection.get(0)] = 1;
//        }
//        
//        int[] connsumm = new int[n];
//        int p = 0;
//        for (int[] row : matrix) {
//            int sum = 0;
//            for (int i : row) {
//                sum += i;
//            }
//            connsumm[p++] = sum;
//        }
//          for (int i = 0; i < connsumm.length; i++) {
//            if (connsumm[i] == 1) {
//                for (int col = 0; col < matrix[i].length; col++) {
//                    if (matrix[i][col] == 1) {
//                        List <Integer> ls = new ArrayList<>();
//                        ls.add(i);
//                        ls.add(matrix[i][col]);
//                        criricalConnections.add(ls);
//                        System.out.println(matrix[i][col] + "," + i);
//                    }
//                }
//            }
//        }
//          
//          return criricalConnections;
//    }
    public static void criticalConnections(int n, int[][] edges) {
        int[][] matrix = new int[n][n];
        for (int[] edge : edges) {
            matrix[edge[0]][edge[1]] = 1;
            matrix[edge[1]][edge[0]] = 1;
        }

        /*
         [
            [0, 1, 1, 0, 0, 0], 
            [1, 0, 1, 1, 0, 0], 
            [1, 1, 0, 0, 0, 0], 
            [0, 1, 0, 0, 1, 1], 
            [0, 0, 0, 1, 0, 1], 
            [0, 0, 0, 1, 1, 0]]
         */
        int[] conncc = new int[n];
        int p = 0;
        for (int[] row : matrix) {
            int sum = 0;
            for (int i : row) {
                sum += i;
            }
            conncc[p++] = sum;
        }

        int maxpoint = -1;
        int maxconn = -1;
        for (int i = 1; i < conncc.length; i++) {
            if (conncc[i] > conncc[i - 1]) {
                maxpoint = i;
                maxconn = conncc[i];
            }
        }

        /*
        [[0, 1, 1, 0], 
         [1, 0, 1, 1], 
         [1, 1, 0, 0], 
         [0, 1, 0, 0]]
        */
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(maxpoint);
        System.out.println(maxconn);



    }
}
