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
public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        int[] prices = {2, 5, 7, 1, 4, 3, 1, 3};
        maxProfit(prices);
    }

    public static void maxProfitWithKTransactions(int[] prices, int k) {

        int[][] T = new int[k + 1][prices.length + 1];
        for (int i = 1; i < T.length; i++) {
            for (int j = 1; j < T[i].length; j++) {
                int max = 0;
                for (int l = 0; l < j; l++) {
                    max = Math.max(max, prices[j] - prices[l] + T[i - 1][l]);
                }
                T[i][j] = Math.max(T[i][j - 1], max);

            }
        }
    }

    public static void maxProfit(int[] price) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < price.length; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            } else if (price[i] - minPrice > maxProfit) {
                maxProfit = price[i] - minPrice;
            }
        }
        System.out.println(maxProfit);
    }
}
