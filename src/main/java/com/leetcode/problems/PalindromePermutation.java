/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leetcode.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author kb7290
 */
public class PalindromePermutation {

    public static void main(String[] args) {
        //printStringPermutations("", "KKB");
       List<String>  ls =   printStringPermutations(new ArrayList<>(), "", "()()()");
       String s1  = "prosperity";
        for (String l : ls) {
         // if(s1.contains(l)){
              System.out.println(l);
         // }  
        }
        
        
        
    }

//    public static void printStringPermutations(String prefix, String str) {
//
//        int n = str.length();
//        if (n == 0) {
//            System.out.println(prefix);
//        } else {
//            for (int i = 0; i < n; i++) {
//                printStringPermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
//            }
//        }
//    }

    public static List<String> printStringPermutations(List<String> list, String prefix, String str) {

        int n = str.length();
        if (n == 0) {
            list.add(prefix);
            //System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                printStringPermutations(list, prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }

        return list;
    }

    public static boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                set.remove(c);
            }
        }
        return set.size() <= 1;
    }
}
