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
public class IntegerToString {

    public static void main(String[] args) {

        System.out.println(numberToWords(20018338));
    }

    public static String[] one_to_nineteen
            = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    public static String[] ten_to_ninty
            = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public static String[] three = {"", "Hundred", "Thousand", "Million", "Billion"};

    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        } else if (num < 20) {
            return one_to_nineteen[num];
        } else if (num < 100) {
            if (num % 10 == 0) {
                return ten_to_ninty[num / 10];
            } else {
                return ten_to_ninty[num / 10] + " " + one_to_nineteen[num % 10];
            }
        } else if (num < 1000) {
            if (num % 100 == 0) {
                return one_to_nineteen[num / 100] + "" + three[1];
            } else {
                return ten_to_ninty[num / 10] + " " + one_to_nineteen[num % 10];
            }
        }

//        if (num == 0) {
//            return "Zero";
//        } else if (num < 20) {
//            return one_to_nineteen[num];
//        } else if (num < 100) {
//            return (num % 10 == 0) ? ten_to_ninty[num / 10] : ten_to_ninty[num / 10] + " " + one_to_nineteen[num % 10];
//        } else if (num < 1000) {
//            return (num % 100 == 0) ? (num / 100 >= one_to_nineteen.length) ? numberToWords(num / 100) + " " + three[1] : one_to_nineteen[num / 100] + " " + three[1] : (num / 100 > one_to_nineteen.length) ? numberToWords(num / 100) + " " + three[1] + " " + numberToWords(num % 100) : one_to_nineteen[num / 100] + " " + three[1] + " " + numberToWords(num % 100);
//        } else if (num < 1000000) {
//            return (num % 1000 == 0) ? (num / 1000 >= one_to_nineteen.length) ? numberToWords(num / 1000) + " " + three[2] : one_to_nineteen[num / 1000] + " " + three[2] : (num / 1000 > one_to_nineteen.length) ? numberToWords(num / 1000) + " " + three[2] + " " + numberToWords(num % 1000) : one_to_nineteen[num / 1000] + " " + three[2] + " " + numberToWords(num % 1000);
//        } else if (num < 1000000000) {
//            
//            return (num % 1000000 == 0) ? (num / 1000000 >= one_to_nineteen.length) ? numberToWords(num / 1000000) + " " + three[3] : one_to_nineteen[num / 1000000] + " " + three[3] : (num / 1000000 > one_to_nineteen.length) ? numberToWords(num / 1000000) + " " + three[3] + " " + numberToWords(num % 1000000) : one_to_nineteen[num / 1000000] + " " + three[3] + " " + numberToWords(num % 1000000);
//        } else {
//            return (num % 1000000000 == 0) ? (num / 1000000000 >= one_to_nineteen.length) ? numberToWords(num / 1000000000) + " " + three[4] : one_to_nineteen[num / 1000000000] + " " + three[4] : (num / 1000000000 > one_to_nineteen.length) ? numberToWords(num / 1000000000) + " " + three[4] + " " + numberToWords(num % 1000000000) : one_to_nineteen[num / 1000000000] + " " + three[4] + " " + numberToWords(num % 1000000000);
//        }
        return null;
    }
}
