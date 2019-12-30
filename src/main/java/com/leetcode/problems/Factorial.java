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
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static int factorial(int k) {
        if (k == 1) {
            return 1;
        }
        return k * factorial(k - 1);
    }
}
