/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.math.BigInteger;

/**
 *
 * @author kb7290
 */
public class AddStrings {

    public static void main(String[] args) {

        System.out.println(addStrings("199", "7"));
    }

    public static String addStrings1(String num1, String num2) {
        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);

        return b1.add(b2).toString();
    }

    public static String addStrings(String num1, String num2) {
        if (num2.length() > num1.length()) {
            return addStrings(num2, num1);
        }

        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);

        num1 = sb1.reverse().toString();
        num2 = sb2.reverse().toString();

        StringBuilder resultBuilder = new StringBuilder();
        int carry = 0;
        int sum = 0;
        for (int i = 0, j = 0; i < num1.length(); i++, j++) {
            int a = num1.charAt(i)-'0';
            int b = (j >= num2.length()) ? 0 : num2.charAt(j)-'0';
            sum = a + b + carry;
            if (sum > 9) {
                carry = sum / 10;
                resultBuilder.append(sum % 10);
            } else {
                carry = 0;
                resultBuilder.append(sum);
            }
        }
        
        if(carry>0){
            resultBuilder.append(carry);
        }

        return resultBuilder.reverse().toString();
    }
}
