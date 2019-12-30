/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.utils;

import com.leetcode.problems.MinStack;

/**
 *
 * @author kb7290
 */
public class Helper {

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(2);
        ms.push(0);
        ms.push(3);
        ms.push(0);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
    }

}
