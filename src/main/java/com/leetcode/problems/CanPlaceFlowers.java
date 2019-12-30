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
public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1, 0, 0};
        int newFlowers = 2;
        System.out.println(canPlaceFlowers(flowerbed, newFlowers));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            switch (flowerbed[i]) {
                case 0:
//                    if ((i == 0 && flowerbed[i + 1] == 0) || (i == flowerbed.length - 1 || flowerbed[i - 1] == 0)) {
//                        flowerbed[i] = 1;
//                    } else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
//                        flowerbed[i] = 1;
//                    }
//                    n = n - 1;
//                    if ((i == 0 || flowerbed[i - 1] == 0) && i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
//                        // if ((i == 0 || flowerbed[i + 1] == 0) || (i == flowerbed.length - 1 || flowerbed[i - 1] == 0) || (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0)) {
//                        flowerbed[i] = 1;
//                        n = n - 1;
//                        //}
//                    }
                    break;
            }
        }

        return n <= 0;
    }
}
