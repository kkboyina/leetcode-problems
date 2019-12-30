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
public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 7, 0, 9};
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] arr) {
        
        int zeroCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[zeroCnt++] = arr[i];
            }
        }
        
        for (int i = zeroCnt; i < arr.length; i++) {
            arr[i]=0;
        }
        
        System.out.println(arr.length-zeroCnt);
        System.out.println(Arrays.toString(arr));

    }
}
