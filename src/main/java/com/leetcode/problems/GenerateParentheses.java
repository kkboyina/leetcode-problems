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
import java.util.Stack;

/**
 *
 * @author kb7290
 */
public class GenerateParentheses {

    public static void main(String[] args) {
//         List<String> list = new ArrayList<>();
//        generateValidParenthesis(5,5,"",list);
//        for (String string : list) {
//            System.out.println(string);
//        }
generateParenthesis(5);
    }

    public static void generateValidParenthesis(int leftopenpar, int rightclosepar, String currstr, List<String> result) {
        if(leftopenpar==0 && rightclosepar==0){
            result.add(currstr);
            return;
        }
        if(leftopenpar>0){
            generateValidParenthesis(leftopenpar-1, rightclosepar, currstr+"(", result);
        }
        if(leftopenpar<rightclosepar){
            generateValidParenthesis(leftopenpar, rightclosepar-1, currstr+")", result);
        }

    }

    /**
     * Naive Approach TLE
     *
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("()");
        }

        String finstr = sb.toString();

        Set<String> set = generateStringPermutations(new HashSet<>(), "", finstr);
        List<String> list = new ArrayList<>();
        for (String s : set) {
            //if (isValidPar(s)) {
            System.out.println(s);
            // list.add(s);
            // }
        }

        return list;
    }

    public static Set<String> generateStringPermutations(Set<String> set, String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            if (prefix.charAt(0) != ')') {
                if (isValidPar(prefix)) {
                    set.add(prefix);
                }

            }
        } else {
            for (int i = 0; i < n; i++) {
                //if(prefix.charAt(0)!=')'){
                generateStringPermutations(set, prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
                //}
            }
        }
        return set;
    }

    public static boolean isValidPar(String par) {
        char[] arr = par.toCharArray();
//        Stack<Character> stack = new Stack<>(); 
//        for(char c: arr){
//            switch(c){
//                case ')':
//                    if(!stack.isEmpty() && stack.peek()=='('){
//                        stack.pop();
//                    }else{
//                        return false;
//                    }
//                    break;
//                default :
//                    stack.push(c);
//            }
//        }
        int balance = 0;
        for (char c : arr) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }

        return balance == 0;
    }
}
