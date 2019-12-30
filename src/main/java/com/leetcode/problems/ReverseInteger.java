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
public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(reverse(1534236469));
        // 2,147,483,647
        //1,534,236,469
    }

    public static int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return 0;
        }
        boolean abs = false;
        if (x < 0) {
            abs = true;
            x = Math.abs(x);
        }
        int res = 0;
        while (x > 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        // System.out.println(x);
        return (abs) ? -res : res;
    }
}
